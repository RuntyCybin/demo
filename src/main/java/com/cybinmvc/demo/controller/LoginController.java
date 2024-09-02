package com.cybinmvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

    @GetMapping("/login")
    public String hello(Model model) {

        model.addAttribute("titulo", "Login mvc");
        model.addAttribute("titulo_h1", "Bienvenido, prueba loguearte");
        
        return "login";
    }

    @PostMapping("/login")
    public String postMethodName(
            @RequestParam("email") String email,
            @RequestParam("password") String pwd,
            RedirectAttributes redirectAttributes,
            Model model_success) {

        if (!email.isBlank() && !pwd.isBlank()) {
            System.out.println("EMAIL: " + email + " PWD: " + pwd);
            model_success.addAttribute("success", "Su email: " + email);
            return "hello";
        }

        log.error("error", "Credenciales vacias");
        redirectAttributes.addFlashAttribute("err", "Credenciales vacias");
        return "redirect:/errlogin";
    }

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

    @GetMapping("/hello")
    public String showWelcomePage() {
        return "hello";
    }
}
