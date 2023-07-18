package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Chris = new Student("Chris", "Chris.castle@getyourguide.com", LocalDate.of(1993, 1, 30));
            Student Alex = new Student("Alex", "alex@gmail.com", LocalDate.of(1993, 1, 30));
            Student Maria = new Student("Maria", "maria@gmail.com", LocalDate.of(1993, 1, 30));

            // This then calls a method in the StudentRepository class to save all of the things above to the database.
            repository.saveAll(List.of(Chris, Alex, Maria));
        };
    }

}
