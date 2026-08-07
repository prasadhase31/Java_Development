package com.example.springannotationpractice.repository;


import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public String getStudentData(){
        return "Student data from repository";
    }
}
