package com.example.springannotationpractice.service;

import com.example.springannotationpractice.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public void registerStudent(){
        System.out.println("Business Logic Executed");
        repository.saveStudent();
    }
}
