package com.example.springimagepushdemo.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping("/hello")
    public String showGreetings()
    {
        //Just added a comment
        //Added comment to test how version of image stored in github
        return "Hello, how are you?";
    }
}
