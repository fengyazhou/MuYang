package com.example.MySpringBootDemo.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Mytest")
@RestController
public class MySpringTestController {
    @RequestMapping("/hello")
    public String Hello() {
        return "hello word!";
    }
}
