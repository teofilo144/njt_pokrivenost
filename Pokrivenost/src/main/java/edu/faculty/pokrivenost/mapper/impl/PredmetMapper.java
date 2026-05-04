/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.mapper.impl;

import edu.faculty.pokrivenost.entity.Predmet;
import edu.faculty.pokrivenost.dto.PredmetDTO;
import edu.faculty.pokrivenost.entity.Katedra;
import edu.faculty.pokrivenost.mapper.DtoEntityMapper;
import org.springframework.stereotype.Component;

/**
 *
 * @author Igor
 */
@Component
public class PredmetMapper implements DtoEntityMapper<PredmetDTO, Predmet> {

    @Override
    public PredmetDTO toDto(Predmet t) {
        return new PredmetDTO(
                t.getId(),
                t.getNaziv(),
                t.getEspb(),
                t.getKatedraId().getId()
        );
    }

    @Override
    public Predmet toEntity(PredmetDTO t) {
        Predmet p = new Predmet(
                t.getId(),
                t.getNaziv(),
                t.getEspb()
        );

        if (t.getKatedraId() != null) {
            Katedra k = new Katedra(t.getKatedraId());
            p.setKatedraId(k);
        }
        
        return p;
    }

}
