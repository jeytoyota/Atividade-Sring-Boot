package com.ensino.escola.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ensino.escola.model.Professore;

public interface ProfessoreRepository extends JpaRepository<Professore, Long> {
	
	

}
