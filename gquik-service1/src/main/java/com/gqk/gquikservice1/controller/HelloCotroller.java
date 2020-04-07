package com.gqk.gquikservice1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gquik")
public class HelloCotroller {

    @GetMapping("hello")
    public String sayHello(){
        return "I wang to say hello !!!";
    }
}
