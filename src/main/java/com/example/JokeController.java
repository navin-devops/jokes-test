package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokeController {

    @GetMapping("/")
    public String getJoke() {
        return "Why don't skeletons fight each other? They don't have the guts!";
    }
}
