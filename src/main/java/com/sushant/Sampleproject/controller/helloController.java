package com.sushant.Sampleproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping
    public String hello(){
        System.out.println("Hello world");
        return "feature changes for PR";
    }
    public String kick(){
        return "Stash contact";
    }


}
