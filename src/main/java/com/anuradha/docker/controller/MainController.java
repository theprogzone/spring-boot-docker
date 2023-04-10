package com.anuradha.docker.controller;

import com.anuradha.docker.dto.PersonDTO;
import com.anuradha.docker.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/docker")
@RequiredArgsConstructor
public class MainController {

    private final PersonService personService;

    @GetMapping("/persons")
    public ResponseEntity<List<PersonDTO>> getAllPersons() {
        return new ResponseEntity<>(personService.getAllPersons(), HttpStatus.OK);
    }
}
