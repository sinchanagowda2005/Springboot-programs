package com.example.addition.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.addition.entity.AdditionEntity;

public interface AdditionRepository extends JpaRepository<AdditionEntity,Long>{
    
}
