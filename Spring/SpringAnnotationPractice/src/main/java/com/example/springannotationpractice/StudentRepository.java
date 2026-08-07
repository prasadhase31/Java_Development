package com.example.springannotationpractice;


import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public String getStudentData(){
        return "Student data from repository";
    }
}
