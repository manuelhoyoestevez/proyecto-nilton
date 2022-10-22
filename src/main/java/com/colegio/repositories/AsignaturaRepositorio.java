package com.colegio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.entities.Asignatura;

@Repository
public interface AsignaturaRepositorio extends JpaRepository<Asignatura, String>{

}
