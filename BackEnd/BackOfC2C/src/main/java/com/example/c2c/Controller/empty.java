package com.example.c2c.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class empty {

    @GetMapping(value = "/hello")
    public String say(){
        return "hello!";
    }
}
