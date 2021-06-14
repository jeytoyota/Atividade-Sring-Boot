package com.blogpessoal.blogpessoal.molel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotEmpty(message="O Nome deve ser preenchido")
	private String nome;
	
	@NotEmpty(message="O usuario deve ser preenchido")
	private String usuario;
	
	@NotEmpty(message="A senha deve ser preenchida")
	private String senha;
	

	public Usuario(long id, @NotEmpty(message = "O Nome deve ser preenchido") String nome,
			@NotEmpty(message = "O usuario deve ser preenchido") String usuario,
			@NotEmpty(message = "A senha deve ser preenchida") String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	
	public Usuario(@NotEmpty(message = "O Nome deve ser preenchido") String nome,
			@NotEmpty(message = "O usuario deve ser preenchido") String usuario,
			@NotEmpty(message = "A senha deve ser preenchida") String senha) {
		super();
		this.nome = nome;
		this.usuario = usuario;
		this.senha = senha;
	}



	public Usuario() {
		
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

}
