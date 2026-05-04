/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.mapper.impl;

import edu.faculty.pokrivenost.dto.KatedraDTO;
import edu.faculty.pokrivenost.entity.Katedra;
import edu.faculty.pokrivenost.mapper.DtoEntityMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author Igor
 */
@Component
public class KatedraMapper implements DtoEntityMapper<KatedraDTO, Katedra> {

    @Override
    public KatedraDTO toDto(Katedra e) {
        return new KatedraDTO(
                e.getId(),
                e.getNazivKatedre()
        );
    }

    @Override
    public Katedra toEntity(KatedraDTO t) {
        return new Katedra(
                t.getId(), 
                t.getNazivKatedre()
        );
    }

}
