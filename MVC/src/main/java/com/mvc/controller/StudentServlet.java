package com.mvc.controller;

import java.io.IOException;

import com.mvc.model.Student;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class StudentServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // Browser madhun direct /student open kela tar index.jsp la redirect hoil
    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.sendRedirect("index.jsp");
    }

    // Form submit zhalyavar hi method execute hoil
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String course = request.getParameter("course");

        // Model object
        Student student = new Student(id, name, course);

        // Data JSP la pathav
        request.setAttribute("student", student);

        // Result page open kar
        request.getRequestDispatcher("result.jsp").forward(request, response);
    }
}