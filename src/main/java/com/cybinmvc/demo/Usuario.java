package com.cybinmvc.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Usuario {

    @Id
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "contrasenia")
    private String pwd;
}
