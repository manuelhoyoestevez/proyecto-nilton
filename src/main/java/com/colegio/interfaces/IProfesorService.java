package com.colegio.interfaces;

import java.util.List;

import com.colegio.entities.Profesor;

public interface IProfesorService {

	public List<Profesor> findAll();
	
	public Profesor findById(String id);
	
	public Profesor save(Profesor profesor);
	
	public Profesor update(Profesor profesor);
	
	public Profesor delete(String id);
	
}
