package com.cybinmvc.demo.model;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;


public interface UsersRepository extends JpaRepository<Usuario, Long> {

    Optional<Usuario> findById(Long id);

    <S extends Usuario> Usuario save(Usuario usuario);

    Optional<Usuario> findByNombre(String nombre);

}
