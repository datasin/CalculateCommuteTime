package com.ks.commute.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommuteController {
    @RequestMapping("/")
    public String hello(){
        return "Hello";
    }
}
