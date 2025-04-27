package com.example;

import com.example.HelloServlet;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.io.PrintWriter;
import java.io.StringWriter;

// Utilisez le même package que dans pom.xml
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// OU pour Java EE 8:
// import javax.servlet.http.HttpServletRequest;
// import javax.servlet.http.HttpServletResponse;

import org.junit.jupiter.api.Test;

public class HelloServletTest {

    @Test
    public void testDoGet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        
        StringWriter stringWriter = new StringWriter();
        PrintWriter writer = new PrintWriter(stringWriter);
        when(response.getWriter()).thenReturn(writer);

        HelloServlet servlet = new HelloServlet();
        servlet.doGet(request, response);

        writer.flush();
        assertTrue(stringWriter.toString().contains("Hello, World!"));
    }
}