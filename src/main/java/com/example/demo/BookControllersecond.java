package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pen")
public class BookControllersecond {
    @GetMapping
    public String getByid(){
        System.out.println("333333");
        return "3333333333";
    }
}
