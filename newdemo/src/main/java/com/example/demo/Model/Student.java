package com.example.demo.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document("students")
public class Student {
    @Id
   //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String dateOfBirth;
    private String standard;
    private String divison;
    private String gender ;

    public Student() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getDivison() {
        return divison;
    }

    public void setDivison(String divison) {
        this.divison = divison;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Student(String name, String dateOfBirth, String standard, String divison, String gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.standard = standard;
        this.divison = divison;
        this.gender = gender;
    }
}
