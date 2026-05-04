/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.faculty.pokrivenost.repository;

import java.util.List;

/**
 *
 * @author Igor
 */
public interface GenericRepository<E, ID> {

    // Create & update
    void save(E entity);

    // Read
    List<E> findAll();

    E findById(ID id) throws Exception;

    // Delete
    void deleteById(ID id);
}
