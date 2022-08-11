package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
    @PostMapping
    public String getByid() {
        System.out.println("1111111");
        return "111111";
    }

    @GetMapping
    public String delete(){
        System.out.println("22222");
        return "22222222";
    }


}
