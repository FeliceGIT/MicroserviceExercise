package com.example.spring.repositories;

import com.example.spring.entities.OptionResponse;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionResponseRepository extends JpaRepository<OptionResponse, Long> {
    
}