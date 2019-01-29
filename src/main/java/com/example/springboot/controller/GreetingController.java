package com.example.springboot.controller;

import java.util.concurrent.atomic.AtomicLong;

import com.example.springboot.model.Greeting;
import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    //@RequestMapping("/greeting")
    @GetMapping("/greeting")
    @ResponseBody
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(template, name));
    }
}