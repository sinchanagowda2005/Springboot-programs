package com.example.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{
    
    
}
