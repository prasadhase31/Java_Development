package com.example.springannotationpractice;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Scope;
@Component
@Scope("prototype")

public class Laptop {

    public Laptop(){
        System.out.println("Laptop Object Created");
    }
    public void start(){
        System.out.println("Laptop Started");
    }

}
