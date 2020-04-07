package com.gqk.gquikservice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("gquik")
public class HiController {

    @RequestMapping("hi")
    public String sayHi(){
        return "I want to say Hi !!!";
    }
}
