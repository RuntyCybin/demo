package com.cybinmvc.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cybin.module.web.model.UsersRepository;
import com.cybin.module.web.model.Usuario;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DemoApplicationTests {

	@Autowired
	UsersRepository repository;

	@BeforeAll
	void beforeAll() {
		List<Usuario> lista = generarUsuarios();
		repository.saveAll(lista);
	}

	private static List<Usuario> generarUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();

		Usuario usuario = new Usuario();
		usuario.setId(1L);
		usuario.setName("Paco");
		usuario.setPwd("qwe");

		usuarios.add(usuario);

		return usuarios;
	}

	@Test
	void findByIdUserTestOK() {
		Optional<Usuario> usuarioaux = repository.findById(1L);
		assertTrue(usuarioaux.isPresent());
	}

	@AfterAll
	void afterAll() {
		repository.deleteAll();
	}

}
