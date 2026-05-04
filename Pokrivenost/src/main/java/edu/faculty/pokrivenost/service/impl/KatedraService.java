/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.service.impl;

import edu.faculty.pokrivenost.dto.KatedraDTO;
import edu.faculty.pokrivenost.entity.Katedra;
import edu.faculty.pokrivenost.mapper.impl.KatedraMapper;
import edu.faculty.pokrivenost.repository.impl.KatedraRepository;
import edu.faculty.pokrivenost.service.GenericService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Igor
 */
@Service
public class KatedraService implements GenericService<KatedraDTO, Long> {

    @Autowired
    private final KatedraRepository repository;
    private final KatedraMapper mapper;

    @Autowired
    public KatedraService(KatedraRepository repository, KatedraMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public KatedraDTO create(KatedraDTO dto) {
        Katedra entity = mapper.toEntity(dto);

        repository.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public List<KatedraDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public KatedraDTO findById(Long id) throws Exception {
        return mapper.toDto(repository.findById(id));
    }

    @Override
    public void deleteById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
