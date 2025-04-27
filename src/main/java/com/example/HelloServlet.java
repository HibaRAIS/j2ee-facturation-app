package com.example;

import java.io.IOException;

// Choisissez les imports correspondant à votre option dans pom.xml

// Pour Jakarta EE 9+:
import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

// OU pour Java EE 8:
// import javax.servlet.*;
// import javax.servlet.annotation.*;
// import javax.servlet.http.*;

@WebServlet("/Hello")
public class HelloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, 
                        HttpServletResponse response) 
            throws ServletException, IOException {
        response.getWriter().write("Hello, World!");
    }
}