package com.colegio.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entities.Profesor;
import com.colegio.interfaces.IProfesorService;
import com.colegio.repositories.ProfesorRepositorio;

@Service
public class ProfesorService implements IProfesorService{

	@Autowired
	private ProfesorRepositorio repositorio;
	
	@Override
	public List<Profesor> findAll() {
		List<Profesor> profesor = repositorio.findAll();
		return profesor;
	}

	@Override
	public Profesor findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor save(Profesor profesor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor update(Profesor profesor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Profesor delete(String id) {
		// TODO Auto-generated method stub
		return null;
	}

}
