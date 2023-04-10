package com.anuradha.docker.service;

import com.anuradha.docker.dto.PersonDTO;

import java.util.List;

public interface PersonService {
    List<PersonDTO> getAllPersons();
}
