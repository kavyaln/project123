package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        response.getWriter().println(
            "<h1>Employee Management Application</h1>"
        );

        response.getWriter().println(
            "<p>Employee ID: 101</p>"
        );

        response.getWriter().println(
            "<p>Employee Name: Kavya</p>"
        );

        response.getWriter().println(
            "<p>Department: DevOps</p>"
        );
    }
}
