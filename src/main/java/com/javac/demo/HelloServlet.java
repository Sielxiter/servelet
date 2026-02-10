package com.javac.demo;

import java.io.*;

import jakarta.servlet.http.*;

public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> TEst Brro</h1>");
        out.println("</body>");
        out.println("<p> ur name is " + request.getParameter("name") + "</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}