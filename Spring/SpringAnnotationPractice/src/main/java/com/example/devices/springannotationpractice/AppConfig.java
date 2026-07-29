package com.example.devices.springannotationpractice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Printer printer(){
        return new Printer();

    }

}
