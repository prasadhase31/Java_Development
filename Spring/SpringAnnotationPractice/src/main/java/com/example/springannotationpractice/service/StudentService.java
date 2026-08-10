package com.example.springannotationpractice.service;

import com.example.springannotationpractice.repository.StudentRepository;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    @Value("${student.name}")
    private String studentName;

    @Value("${student.course}")
    private String course;

    @Value("${student.age}")
    private int age;

    @PostConstruct
    public void init(){
        System.out.println("StudentService Bean Created");
        System.out.println("Student Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Age: " + age);

    }

    @PreDestroy
    public void cleanup(){

    }
    public void registerStudent() {

        System.out.println("Business Logic Executed");

        repository.saveStudent();
    }
}