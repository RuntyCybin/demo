package com.cybinmvc.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;


public interface UsersRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findById(Long id);

    Usuario save(Usuario usuario);

    Optional<Usuario> findByNombre(String nombre);

}
