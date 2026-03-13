package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.StudentRequest;
import com.example.demo.dto.response.StudentResponse;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
@Service
public class StudentService {
    

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

public StudentResponse processStudent(StudentRequest request){
    int total=request.getMarks().stream().mapToInt(Integer::intValue).sum();
     double percentage=(double)total/request.getMarks().size();
    String result=percentage>=75? "PASS":"FAIL";

    Student student=new Student();
    student.setName(request.getName());
    student.setRollnumber(request.getRollNumber());
    student.setTotal(total);
    student.setPercentage(percentage);
    student.setResult(result);

    studentRepository.save(student);

    return new StudentResponse(request.getName(), request.getRollNumber(), total, percentage, result);
}
    public List<StudentResponse> getAllStudentResults(){
        return studentRepository.findAll()
        .stream()
        .map(student->new StudentResponse(
            student.getName(),
            student.getRollnumber(),
            student.getTotal(),
            student.getPercentage(),
            student.getResult())
        ).toList();
    
}
    
}

