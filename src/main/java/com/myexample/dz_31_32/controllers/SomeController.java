package com.myexample.dz_31_32.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @GetMapping("hello")
    public String sayHello() {
        return "Thanks for the tasks, it was useful";
    }
}
