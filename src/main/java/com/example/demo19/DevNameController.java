package com.example.demo19;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DevNameController {

    @Value("${authCode}")
    private String authCode;

    @Value("${devName}")
    private String devName;
    @GetMapping
    public String greetings(){
        return "Greetings " + devName + "! Your auth code is " + authCode;
    }


}
