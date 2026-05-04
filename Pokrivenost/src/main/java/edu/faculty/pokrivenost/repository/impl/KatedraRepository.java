/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.repository.impl;

import edu.faculty.pokrivenost.entity.Katedra;
import edu.faculty.pokrivenost.repository.GenericRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Igor
 */
@Repository
public class KatedraRepository implements GenericRepository<Katedra, Long> {

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void save(Katedra entity) {
        if (entity.getId() == null) {
            em.persist(entity); // Novi
        } else {
            em.merge(entity); // Update u slucaju da postoji
        }
    }

    @Override
    public List<Katedra> findAll() {
        return em.createQuery("SELECT k FROM Katedra k", Katedra.class)
                .getResultList();
    }

    @Override
    public Katedra findById(Long id) throws Exception {
        Katedra katedra = em.find(Katedra.class, id);
        if (katedra == null) {
            throw new Exception("Katedra sa zadatom sifrom ne postoji");
        }
        return katedra;
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        Katedra katedra = em.find(Katedra.class, id);
        if (katedra != null) {
            em.remove(katedra);
        }
    }

}
