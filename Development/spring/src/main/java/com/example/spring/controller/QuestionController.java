package com.example.spring.controller;

import java.util.List;

import com.example.spring.entities.Question;
import com.example.spring.repositories.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class QuestionController {
    
    @Autowired 
    private QuestionRepository repository;

    @GetMapping("/questions")
    public List<Question> getQuestions() {
        return repository.findAll();
    }

    @PostMapping(value = "/questions", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public void saveQuestion(@RequestBody Question question) {
        if (question.getOptions() != null)
            question.getOptions().forEach(o -> o.setQuestion(question));
        repository.save(question);
        List<Question> questionList = repository.findAll();
        questionList.forEach(q -> System.out.println(q.toString()));
    }
}