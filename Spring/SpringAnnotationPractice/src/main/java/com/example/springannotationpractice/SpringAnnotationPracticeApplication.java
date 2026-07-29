package com.example.springannotationpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAnnotationPracticeApplication {

    public static void main(String[] args) {

        ApplicationContext context=
        SpringApplication.run(SpringAnnotationPracticeApplication.class, args);

        Student student=context.getBean(Student.class);
        student.study();
    }

}
