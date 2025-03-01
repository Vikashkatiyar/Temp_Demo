package com.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getMessage")
public class MessageController {

    @GetMapping("/{name}")
    public String getMessage(@PathVariable String name){
        return "Hello " + name + ", How are you ?";
    }

    @GetMapping("/{name}")
    public String getAbusiveContent(String name){
        return name + " BhoshdiWale😉";
    }

    @GetMapping("/boot")
    public String getHelloFromSpringBoot(){
        return "Hello Spring Developer";
    }

}
