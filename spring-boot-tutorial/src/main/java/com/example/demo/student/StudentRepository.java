package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
// This is the interface that allows us to interact with the database.
// Student is the type we want to interact with, and Long is the type of the primary key.
public interface StudentRepository extends JpaRepository<Student, Long> {

    // This is a custom query that we can use to find a student by email. It translates into SQL.
    // @Query(SELECT * FROM student s WHERE s.email = ?1)
    Optional<Student> findStudentByEmail(String email);
}
