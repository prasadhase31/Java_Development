package com.example.springannotationpractice.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import com.example.springannotationpractice.service.ReportService;

@Service
//@Lazy
public class ReportService {

    public ReportService(){
        System.out.println("ReportService Object Created");
    }
    public void generateReport(){
        System.out.println("Report Generated");
    }
}
