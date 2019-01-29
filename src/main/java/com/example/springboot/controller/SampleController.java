package com.example.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    //@RequestMapping("/")
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "Hello from Spring Boot!";
    }

}