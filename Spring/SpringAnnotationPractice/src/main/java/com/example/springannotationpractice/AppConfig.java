package com.example.springannotationpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.Printer;

@Configuration
public class AppConfig {

    @Bean
    public Printer printer(){
        return new Printer();

    }

}
