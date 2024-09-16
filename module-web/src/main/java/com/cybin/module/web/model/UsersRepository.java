package com.cybin.module.web.model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UsersRepository extends JpaRepository<Usuario, Long> {

    <S extends Usuario> Usuario save(Usuario usuario);

    Optional<Usuario> findByName(String nombre);

    Optional<Usuario> findByEmailAndPwd(String email, String pwd);

}
