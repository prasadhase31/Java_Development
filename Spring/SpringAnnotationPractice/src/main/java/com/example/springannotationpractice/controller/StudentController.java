package com.example.springannotationpractice.controller;

import com.example.springannotationpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/student")
    public String getStudent(){

        return "Student API Working";
    }

    @PostMapping("/student")
    public String addStudent() {

        return "Student Added Successfully";

    }

    public void processStudent() {

        System.out.println("Request Received");

        service.registerStudent();

    }

}