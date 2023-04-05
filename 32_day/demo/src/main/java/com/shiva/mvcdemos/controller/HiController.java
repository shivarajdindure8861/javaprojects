package com.shiva.mvcdemos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/hi")
@Controller
public class HiController {
    @GetMapping("/sayHi") // request with the HTTP GET method
    public String hi() { // http://localhost:8080/hi/sayHi
        return "hi";
    }
}
