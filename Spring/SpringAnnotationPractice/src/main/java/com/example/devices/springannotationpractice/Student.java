package com.example.devices.springannotationpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    @Autowired
    private Laptop laptop;

    @Autowired
    private Printer printer;

    @Autowired
    private Mouse mouse;

    public void study(){
        laptop.start();

        printer.print();

        System.out.println("Student is studying Sping Framework");
    }

}
