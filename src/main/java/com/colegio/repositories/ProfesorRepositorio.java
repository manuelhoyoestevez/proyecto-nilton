package com.colegio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.colegio.entities.Profesor;

@Repository
public interface ProfesorRepositorio extends JpaRepository<Profesor, String>{

}
