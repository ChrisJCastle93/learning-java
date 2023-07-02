package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @GetMapping
//    public String hello() {
//        return "helloworld";
//    }

    @GetMapping
    public List<Student> helloList() {
        return List.of(new Student(
                1L,
                "Chris",
                "chrisjcastle93@gmail.com",
                LocalDate.of(1993, 1, 30),
                30
        ));
    }
}
