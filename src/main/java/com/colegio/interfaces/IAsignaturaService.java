package com.colegio.interfaces;

import java.util.List;

import com.colegio.entities.Asignatura;

public interface IAsignaturaService {
	
	public List<Asignatura> findAll();
	
	public Asignatura findById(String id);
	
	public Asignatura save(Asignatura asignatura);
	
	public Asignatura update(Asignatura asignatura);
	
	public Asignatura delete(String id);
	
}
