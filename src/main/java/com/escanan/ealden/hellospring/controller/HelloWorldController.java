package com.escanan.ealden.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller()
public class HelloWorldController {
    @RequestMapping("/HelloWorld")
    @ResponseBody
    public String helloWorld() {
        return "Hello, Spring!";
    }
}
