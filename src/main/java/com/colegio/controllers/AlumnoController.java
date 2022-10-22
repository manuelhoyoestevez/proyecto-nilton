package com.colegio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entities.Alumno;
import com.colegio.interfaces.IAlumnoService;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

	@Autowired
	private IAlumnoService service;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> findAll() {
		List<Alumno> alumnos = service.findAll();
		return ResponseEntity.ok(alumnos);
		
	}
	
}
