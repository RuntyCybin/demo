package com.cybin.module.web.model;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    UsersRepository repository;

    @Override
    public void insertarUsuario(UsuarioInDto userDto) {
        repository.save(Usuario.builder()
                .email(userDto.getEmail())
                .name(userDto.getName())
                .pwd(userDto.getPwd())
                .build());
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorId(Long idusuario) {
        return repository.findById(idusuario);
    }

    @Override
    public Optional<Usuario> obtenerUsuarioPorNombre(String nombre) {
        return repository.findByName(nombre);
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorEmailYContrasenia(String email, String pass) {
        return repository.findByEmailAndPwd(email, pass);
    }

}
