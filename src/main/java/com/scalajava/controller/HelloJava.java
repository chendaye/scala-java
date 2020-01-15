package com.scalajava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloJava {
    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(){
        return "Say Hello Java";
    }
}
