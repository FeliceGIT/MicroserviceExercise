package com.example.spring.repositories;

import com.example.spring.entities.QuestionResponse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionResponseRepository extends JpaRepository<QuestionResponse, Long> {
    
}