/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.service;

import java.util.List;

/**
 *
 * @author Igor
 */
public interface GenericService<DTO, ID> {

    DTO create(DTO dto);

    List<DTO> findAll();

    DTO findById(ID id) throws Exception;

    void deleteById(ID id);
}
