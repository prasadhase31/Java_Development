package com.example.springannotationpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Laptop laptop;

    @Autowired
    private Printer printer;

    @Autowired
   // @Qualifier("petrolEngine")
    private Engine engine;


    public void study(){

        laptop.start();

        printer.print();

        engine.start();
        System.out.println("Student is Studying Spring");
    }
}
