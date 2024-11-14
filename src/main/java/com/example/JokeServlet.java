package com.example;

import java.io.IOException;
import java.util.Random;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JokeServlet extends HttpServlet {
    private static final String[] JOKES = {
        "Why don't scientists trust atoms? Because they make up everything!",
        "Why did the scarecrow win an award? Because he was outstanding in his field!",
        "What do you get if you cross a snowman and a vampire? Frostbite!",
        "Why did the bicycle fall over? Because it was two-tired!",
        "How does a penguin build its house? Igloos it together!"
    };

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Random random = new Random();
        String joke = JOKES[random.nextInt(JOKES.length)];
        
        resp.setContentType("text/plain");
        resp.getWriter().println(joke);
    }
} 
