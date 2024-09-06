package com.cybinmvc.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cybinmvc.demo.model.UsersService;
import com.cybinmvc.demo.model.Usuario;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    UsersService usersService;

    /**
     * @param model
     * @return
     */
    @GetMapping("/login")
    public String hello(Model model) {
        model.addAttribute("titulo", "Login mvc");
        model.addAttribute("titulo_h1", "Bienvenido, prueba loguearte");
        return "login";
    }

    /**
     * @param email
     * @param pwd
     * @param redirectAttributes
     * @param model_success
     * @return
     */
    @PostMapping("/login")
    public String postMethodName(
            @RequestParam("email") String email,
            @RequestParam("password") String pwd,
            RedirectAttributes redirectAttributes,
            Model model_success) {

        String msg = "";
        if (!email.isBlank() && !pwd.isBlank()) {
            Optional<Usuario> optUser = usersService
                    .buscarUsuarioPorEmailYContrasenia(email, pwd);
                    
            if (optUser.isPresent()) {
                model_success.addAttribute("success", "Su email: " + email);
                return "hello";
            }
            msg = "Credenciales Incorrectas";
        } else {
            msg = "Credenciales vacias";
        }

        redirectAttributes.addFlashAttribute("err", msg);
        return "redirect:/errlogin";
    }
    
}
