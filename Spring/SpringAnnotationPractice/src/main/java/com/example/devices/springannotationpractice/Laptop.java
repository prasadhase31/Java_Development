package com.example.devices.springannotationpractice;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void start(){
        System.out.println("Laptop Started");
    }
}
