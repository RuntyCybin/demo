package com.cybin.module.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ErrorController {
    
    /**
     * @param model_error
     * @return
     */
    @GetMapping("/errlogin")
    public String showErrorPage(Model model_error) {
        // Comprobación de si el atributo "error" está presente en el modelo
        if (model_error.containsAttribute("err")) {
            log.warn("warning", "Error Attribute Exists: "
                    + model_error.getAttribute("error"));
        } else {
            log.warn("warning", "Error Attribute NOT Found!");
        }

        return "error-login";
    }
}
