package com.example.springimagepushdemo.greet;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greetings {

    @GetMapping("/hello")
    public String showGreetings()
    {
        //Just added a comment.
        //Added comment to test how version of image stored in github.
        //Added comment to test version again.
        return "Hello User!, how are you?";
    }
}
