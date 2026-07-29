package com.example.devices.springannotationpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.springannotationpractice","com.example.devices")
public class SpringAnnotationPracticeApplication {

    public static void main(String[] args) {

        ApplicationContext context=
        SpringApplication.run(SpringAnnotationPracticeApplication.class, args);

        Student student=context.getBean(Student.class);
        student.study();
    }

}
