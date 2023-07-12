package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// This is where the business logic happens.
// The @Component / @Service annotation facilitates the autowiring in the StudentController class.
@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
        // We replaced this with the StudentRepository class above.
//        return List.of(new Student(
//                1L,
//                "Chris",
//                "chrisjcastle93@gmail.com",s
//                LocalDate.of(1993, 1, 30),
//                30
//        ));
    }
}
