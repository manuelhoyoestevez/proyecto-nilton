package com.colegio.interfaces;

import java.util.List;

import com.colegio.entities.Alumno;

public interface IAlumnoService {

	public List<Alumno> findAll();
	
	public Alumno findById(String id);
	
	public Alumno save(Alumno alumno);
	
	public Alumno update(Alumno alumno);
	
	public Alumno delete(String id);
	
}
