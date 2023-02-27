package com.example.demo.resource;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class StudentRequest {

    private String id;
    private String name;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dateOfBirth;
    private String standard;
    private String divison;
    private String gender ;

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
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

    public StudentRequest(String name, Date dateOfBirth, String standard, String divison, String gender) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.standard = standard;
        this.divison = divison;
        this.gender = gender;
    }
}
