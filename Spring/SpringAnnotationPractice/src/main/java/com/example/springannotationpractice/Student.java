package com.example.springannotationpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Laptop laptop;

    public void study(){
        laptop.start();

        System.out.println("Student is studying Sping Framework");
    }

}
