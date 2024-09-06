package com.cybinmvc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;

import com.cybinmvc.demo.model.UsersService;
import com.cybinmvc.demo.model.Usuario;
import com.cybinmvc.demo.model.UsuarioInDto;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@Controller
public class RegisterController {

    @Autowired
    UsersService usersService;

    /**
     * @return
     */
    @GetMapping("/signup")
    public String showSignUpPage() {

        return "signup";
    }

    @PostMapping("/signup")
    public ResponseEntity<Usuario> signUpUser(
            @ModelAttribute UsuarioInDto usuario) {
        log.info("usuario: " + usuario);
        usersService.insertarUsuario(usuario);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
