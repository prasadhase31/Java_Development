package com.example.springannotationpractice;

import com.example.springannotationpractice.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAnnotationPracticeApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(SpringAnnotationPracticeApplication.class, args);

        StudentController controller =
                context.getBean(StudentController.class);

        controller.processStudent();

    }

}