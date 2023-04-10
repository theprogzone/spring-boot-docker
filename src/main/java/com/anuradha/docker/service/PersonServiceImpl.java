package com.anuradha.docker.service;

import com.anuradha.docker.dto.PersonDTO;
import com.anuradha.docker.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public List<PersonDTO> getAllPersons() {
        return personRepository.findAll().stream().map(p -> new PersonDTO(p.getId(), p.getFirstName(), p.getLastName(), p.getAge(), p.getCountry())).toList();
    }
}
