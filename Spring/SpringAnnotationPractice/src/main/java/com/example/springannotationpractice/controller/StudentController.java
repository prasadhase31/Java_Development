package com.example.springannotationpractice.controller;

import com.example.springannotationpractice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    public void processStudent() {

        System.out.println("Request Received");

        service.registerStudent();

    }

}