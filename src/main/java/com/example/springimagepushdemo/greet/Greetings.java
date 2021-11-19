package com.example.springimagepushdemo.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping("/hello")
    public String showGreetings()
    {
        //Just added a comment
        return "Hello, how are you?";
    }
}
