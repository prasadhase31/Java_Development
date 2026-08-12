package com.example.springannotationpractice.controller;

import com.example.springannotationpractice.Student;
import com.example.springannotationpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

//@Controller
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/student/{id}")
    public String getStudent(@PathVariable int id) {
        return "Student ID: " + id;
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {

        return "Student Added :"+ student.getName()
                            +"," + student.getEmail()
                            +"," + student.getCourse();
    }

    public void processStudent() {

        System.out.println("Request Received");

        service.registerStudent();

    }

}