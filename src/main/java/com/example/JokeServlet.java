package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class JokeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        PrintWriter out = resp.getWriter();
        out.println("Why don’t skeletons fight each other? They don’t have the guts.");
    }
}
