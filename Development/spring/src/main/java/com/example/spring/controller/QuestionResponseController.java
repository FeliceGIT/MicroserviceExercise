package com.example.spring.controller;

import java.util.List;

import com.example.spring.entities.QuestionResponse;
import com.example.spring.repositories.QuestionResponseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class QuestionResponseController {
    
    @Autowired
    private QuestionResponseRepository repository;

    @GetMapping("/responses")
    public List<QuestionResponse> getQuestions() {
        return repository.findAll();
    }

    @PostMapping(value = "/responses", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveCatalog(QuestionResponse questionResponse) {
        repository.save(questionResponse);
    }
}