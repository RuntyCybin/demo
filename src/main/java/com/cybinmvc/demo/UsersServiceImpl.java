package com.cybinmvc.demo;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository repository;

    @Override
    public boolean insertarUsuario(Usuario usuario) {
        Boolean res = false;
        Usuario usuarioGuardado = repository.save(usuario);

        if (null != usuarioGuardado) {
            res = Boolean.TRUE;
        }

        return res;
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorId(Long idusuario) {
        return repository.findById(idusuario);
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorNombre(String nombre) {
        return repository.findByNombre(nombre);
    }

}
