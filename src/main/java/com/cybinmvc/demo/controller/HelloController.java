package com.cybinmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HelloController {

    /**
     * @return
     */
    @GetMapping("/hello")
    public String showWelcomePage(Model model) {
        model.addAttribute("active", "true");
        model.addAttribute("titulo", "Pagina principal");
        model.addAttribute("nombre_autor", "Nikolay Shelevoy");
        model.addAttribute("email_autor", "Nikolay Shelevoy");
        model.addAttribute("telf_autor", "Nikolay Shelevoy");
        model.addAttribute("dir_autor", "Nikolay Shelevoy");
        return "hello";
    }
}
