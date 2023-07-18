package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    // if you click postMapping, you can run a HTTP client to test the endpoint
    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    @PutMapping(path = "{studentId}")
    public void updateStudent(@PathVariable("studentId") Long studentId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) String email) {
        studentService.updateStudent(studentId, name, email);
    }
}
