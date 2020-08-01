package com.example.spring.repositories;

import com.example.spring.entities.Option;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Option, Long> {
    
}