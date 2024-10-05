package com.suhasini.learningdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {
    @GetMapping("/")
    public String sayHello() {
        return "Hello Shakti";
    }
}
