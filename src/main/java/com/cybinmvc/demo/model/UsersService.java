package com.cybinmvc.demo.model;

import java.util.Optional;

public interface UsersService {

    /**
     * @param   usuario
     * @return  boolean true si inserto o false si no
     */
    void insertarUsuario(UsuarioInDto userDto);

    /**
     * @param   idusuario
     * @return  Optional de usuario
     */
    Optional<Usuario> obtenerUsuarioPorId(Long idusuario);

    /**
     * @param   nombre
     * @return  Optional de usuario
     */
    Optional<Usuario> obtenerUsuarioPorNombre(String nombre);

    /**
     * @param   email
     * @param   pass
     * @return  Optional de usuario
     */
    Optional<Usuario> buscarUsuarioPorEmailYContrasenia(String email, String pass);
}
