package com.colegio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.entities.Alumno;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, String>{

}
