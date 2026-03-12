package com.example.demo2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo2.entity.RegistrationNumber;

public interface RegisterNumberRepository extends JpaRepository<RegistrationNumber, Long> {
}