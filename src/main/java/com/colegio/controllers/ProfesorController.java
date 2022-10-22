package com.colegio.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entities.Profesor;
import com.colegio.interfaces.IProfesorService;
import com.colegio.model.ErrorException;
import com.colegio.model.ResponseBase;


@RestController
@RequestMapping("/profesores")
public class ProfesorController {

	@Autowired
	private IProfesorService service;
	
	@GetMapping("/getAll")
	public ResponseEntity<?> findAll() {
		try {
			List<Profesor> profesors = service.findAll();
			return ResponseEntity.ok(profesors);
		} catch (ErrorException e) {
			return new ResponseEntity<ResponseBase>(new ResponseBase(e), e.getIdStatus());
		}
	}
	
}
