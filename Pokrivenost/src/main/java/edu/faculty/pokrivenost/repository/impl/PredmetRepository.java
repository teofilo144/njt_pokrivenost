/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.repository.impl;

import edu.faculty.pokrivenost.entity.Predmet;
import edu.faculty.pokrivenost.repository.GenericRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Igor
 */
@Repository
public class PredmetRepository implements GenericRepository<Predmet, Long> {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(Predmet entity) {
        if (entity.getId() == null) {
            em.persist(entity); // Novi
        } else {
            em.merge(entity); // Update u slucaju da postoji
        }
    }

    @Override
    public List<Predmet> findAll() {
        return em.createQuery("SELECT p FROM Predmet p", Predmet.class)
                .getResultList();
    }

    @Override
    public Predmet findById(Long id) throws Exception {
        Predmet predmet = em.find(Predmet.class, id);
        if (predmet == null) {
            throw new Exception("Predmet sa zadatom sifrom ne postoji");
        }
        return predmet;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Predmet predmet = em.find(Predmet.class, id);
        if (predmet != null) {
            em.remove(predmet);
        }
    }

}
