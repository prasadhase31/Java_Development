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

    @GetMapping("/student/search")
    public String searchStudent(@RequestParam("name") String name) {

        return "Searching student: " + name;
    }

    @PostMapping("/student")
    public String addStudent(@RequestBody Student student) {

        return "Student Added :"+ student.getName()
                            +"," + student.getEmail()
                            +"," + student.getCourse();
    }

    @PutMapping("/student/{id}")
    public String updateStudent(
            @PathVariable("id") int id,
            @RequestBody Student student) {

        return "Student " + id + " Updated: "
                + student.getName()
                + ", "
                + student.getEmail()
                + ", "
                + student.getCourse();

    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") int id) {

        return "Student " + id + " Deleted Successfully";
    }

    public void processStudent() {

        System.out.println("Request Received");

        service.registerStudent();

    }

}