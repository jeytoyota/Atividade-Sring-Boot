package com.ensino.escola.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Professore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private String turma;
	
	@OneToMany(mappedBy = "professore", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("professore")
	private List<Estudante> estudante;

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

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public List<Estudante> getEstudante() {
		return estudante;
	}

	public void setEstudante(List<Estudante> estudante) {
		this.estudante = estudante;
	}
	
	

}
