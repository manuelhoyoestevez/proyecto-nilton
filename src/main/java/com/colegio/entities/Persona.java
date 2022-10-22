package com.colegio.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Persona extends Base{

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellido;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "fecha_nacimiento")
	private Date fechaNacimiento;

	
	
	
	public Persona() {
		super();
	}

	
	
	
	public Persona(String nombre, String apellido, String dni, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
	}

	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
}
