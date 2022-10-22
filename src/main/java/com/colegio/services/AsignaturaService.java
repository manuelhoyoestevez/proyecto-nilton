package com.colegio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entities.Asignatura;
import com.colegio.interfaces.IAsignaturaService;
import com.colegio.repositories.AsignaturaRepositorio;

@Service
public class AsignaturaService implements IAsignaturaService{

	@Autowired
	private AsignaturaRepositorio repositorio;
	
	@Override
	public List<Asignatura> findAll() {
		List<Asignatura> asignatura = repositorio.findAll();
		return asignatura;
	}

	@Override
	public Asignatura findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asignatura save(Asignatura asignatura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asignatura update(Asignatura asignatura) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Asignatura delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
