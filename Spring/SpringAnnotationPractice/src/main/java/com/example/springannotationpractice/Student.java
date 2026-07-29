package com.example.springannotationpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class Student {

    @Autowired
    private Laptop laptop;
    public void study(){
        System.out.println("Student is Studying Spring");
    }
}
