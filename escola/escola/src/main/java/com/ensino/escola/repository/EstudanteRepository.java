package com.ensino.escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ensino.escola.model.Estudante;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {

}
