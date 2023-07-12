package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

// This is the API layer. The annotations define the endpoint paths.

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    // create a variable that holds the student service
    private final StudentService studentService;

    // This is the constructor. Whenever we create an object based on this class, we pass in the student service class, and set it to the private variable.
    // The @Autowired annotation injects the instantiated studentService into the constructor. We don't have to call 'new'.
    // In the other file, we have to use a @Component or @Service annotation to wire it up.
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // This then calls the student service, and returns it.
    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
