package com.cybinmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HelloController {

    /**
     * @return
     */
    @GetMapping("/hello")
    public String showWelcomePage() {
        return "hello";
    }
}
