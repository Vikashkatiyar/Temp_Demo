package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/goodMorning")
public class GoodMorningController {

    @GetMapping("/{name}")
    public String goodMorning(@PathVariable String name){
        return "Good Morning " + name + "🌅🌅🌅";
    }
}
