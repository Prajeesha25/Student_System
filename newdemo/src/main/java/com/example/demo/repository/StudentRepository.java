package com.example.demo.repository;

import com.example.demo.Model.Student;
import com.example.demo.resource.StudentRequest;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {

}
