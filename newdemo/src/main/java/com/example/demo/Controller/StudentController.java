package com.example.demo.Controller;


import com.example.demo.Model.Student;
import com.example.demo.repository.StudentRepository;
import com.example.demo.resource.StudentRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@CrossOrigin
@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository productRepository) {
        this.studentRepository = productRepository;
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getAllProducts() {

        return ResponseEntity.ok(this.studentRepository.findAll());

    }

    @PostMapping("/add")
    public ResponseEntity<Student> createProduct(@RequestBody StudentRequest studentRequest) {
        Student student = new Student();
        student.setName(studentRequest.getName());
        student.setDateOfBirth(studentRequest.getDateOfBirth());
        student.setStandard(studentRequest.getStandard());
        student.setDivison(studentRequest.getDivison());
        student.setGender(studentRequest.getGender());
        return ResponseEntity.status(201).body(this.studentRepository.save(student));

    }
}
