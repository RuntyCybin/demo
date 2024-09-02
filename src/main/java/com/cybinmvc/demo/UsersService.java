package com.cybinmvc.demo;

import java.util.Optional;

import com.cybinmvc.demo.Usuario;

public interface UsersService {

    /**
     * @param usuario
     * @return boolean true si inserto o false si no
     */
    boolean insertarUsuario(Usuario usuario);

    /**
     * @param idusuario
     * @return
     */
    Optional<Usuario> obtenerUsuarioPorId(Long idusuario);

    /**
     * @param nombre
     * @return
     */
    Optional<Usuario> obtenerUsuarioPorNombre(String nombre);
}
