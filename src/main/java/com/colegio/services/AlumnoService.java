package com.colegio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entities.Alumno;
import com.colegio.interfaces.IAlumnoService;
import com.colegio.repositories.AlumnoRepositorio;

@Service
public class AlumnoService implements IAlumnoService{

	@Autowired
	private AlumnoRepositorio repositorio;
	
	@Override
	public List<Alumno> findAll() {
		List<Alumno> alumnos = repositorio.findAll();
		return alumnos;
	}

	@Override
	public Alumno findById(String id) {
		return repositorio.findById(id).orElseThrow();
	}

	@Override
	public Alumno save(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno update(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Alumno delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
