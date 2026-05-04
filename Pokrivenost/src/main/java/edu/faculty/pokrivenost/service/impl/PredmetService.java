/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.faculty.pokrivenost.service.impl;

import edu.faculty.pokrivenost.dto.PredmetDTO;
import edu.faculty.pokrivenost.entity.Predmet;
import edu.faculty.pokrivenost.mapper.impl.PredmetMapper;
import edu.faculty.pokrivenost.repository.impl.PredmetRepository;
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
public class PredmetService implements GenericService<PredmetDTO, Long> {

    @Autowired
    private final PredmetRepository repository;
    private final PredmetMapper mapper;

    @Autowired
    public PredmetService(PredmetRepository repository, PredmetMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public PredmetDTO create(PredmetDTO dto) {
        Predmet entity = mapper.toEntity(dto);

        repository.save(entity);
        return mapper.toDto(entity);
    }

    @Override
    public List<PredmetDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(mapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public PredmetDTO findById(Long id) throws Exception {
        return mapper.toDto(repository.findById(id));
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
