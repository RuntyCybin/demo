package com.cybinmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ErrorController {
    
    /**
     * @param model
     * @return
     */
    @GetMapping("/errlogin")
    public String showErrorPage(Model model) {
        // Comprobación de si el atributo "error" está presente en el modelo
        if (model.containsAttribute("err")) {
            log.warn("warning", "Error Attribute Exists: "
                    + model.getAttribute("error"));
        } else {
            log.warn("warning", "Error Attribute NOT Found!");
        }

        return "error-login";
    }
}
