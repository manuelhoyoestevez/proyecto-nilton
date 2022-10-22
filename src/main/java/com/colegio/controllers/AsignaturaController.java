package com.colegio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entities.Asignatura;
import com.colegio.interfaces.IAsignaturaService;

@RestController
@RequestMapping("/asignaturas")
public class AsignaturaController {

	@Autowired
	private IAsignaturaService service;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> findAll() {
		List<Asignatura> asignatura = service.findAll();
		return ResponseEntity.ok(asignatura);
		
	}
	
}
