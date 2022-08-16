package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/guojunjieshishei")
public class BookControllersecond {
    @GetMapping
    public String getByid(){
        System.out.println("郭俊杰是个傻逼");
        return "郭俊杰是个傻逼";
    }
}
