package com.cybinmvc.demo.model;

import java.util.Optional;

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
