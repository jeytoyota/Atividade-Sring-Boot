package com.blogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.blogpessoal.blogpessoal.molel.Usuario;
import com.blogpessoal.blogpessoal.repository.UsuarioRepository;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UsuarioRepositoryTest {
	
	@Autowired
	private UsuarioRepository repository;
	
	@BeforeAll
	void start() {
		Usuario usuario = new Usuario(null,"Maria","maria@", "123456789");
		if(repository.findByUsuario(usuario.getUsuario())!=null)
			repository.save(usuario);
		
		usuario = new Usuario(null,"Mariana","mariana@", "123456789");
		if(repository.findByUsuario(usuario.getUsuario())!=null)
			repository.save(usuario);
		
		usuario = new Usuario(null,"Marisa","marisa@", "123456789");
		if(repository.findByUsuario(usuario.getUsuario())!=null)
			repository.save(usuario);
	}
	
	@Test
	public void findByUsuarioRetornaUsuario() throws Exception {

		Usuario usuario = repository.findByUsuario("VagnerBoaz").get();
		assertTrue(usuario.getUsuario().equals("VagnerBoaz"));
	}
	
	@AfterAll
	public void end() {
		repository.deleteAll();
	}

}
