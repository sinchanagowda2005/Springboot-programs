package com.example.demo2.Service;

import org.springframework.stereotype.Service;

import com.example.demo2.Repository.RegisterNumberRepository;
import com.example.demo2.Repository.StudentRepository;
import com.example.demo2.dto.request.StudentRequest;
import com.example.demo2.dto.response.StudentResponse;
import com.example.demo2.entity.RegistrationNumber;
import com.example.demo2.entity.Student;

@Service
public class StudentService {
    private final StudentRepository studentRepository;
    private final RegisterNumberRepository registerNumberRepository;

    public StudentService(StudentRepository studentRepository, RegisterNumberRepository registerNumberRepository) {
        this.studentRepository = studentRepository;
        this.registerNumberRepository = registerNumberRepository;
    }

    public StudentResponse saveStudent(StudentRequest studentRequest){
        Student student = new Student();
        student.setName(studentRequest.getName());
        Student savedStudent = studentRepository.save(student);

        return new StudentResponse(savedStudent.getName(), savedStudent.getId(), null);
    }

    public StudentResponse assignRegistration(Long studentId, String regNumber){
        Student student = studentRepository.findById(studentId)
                        .orElseThrow(() -> new RuntimeException("Student not found"));
        
        RegistrationNumber register = new RegistrationNumber();
        register.setRegistrationNumber(regNumber);

        RegistrationNumber savedRegister = registerNumberRepository.save(register);

        student.setRegistrationNumber(savedRegister); 
        studentRepository.save(student);
        
        return new StudentResponse(student.getName(), student.getId(), savedRegister.getRegNumber());
    }
}