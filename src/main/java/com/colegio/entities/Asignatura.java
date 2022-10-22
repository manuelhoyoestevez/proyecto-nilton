package com.colegio.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "asignaturas")
public class Asignatura extends Base {

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "departamento")
	private String departamento;
	
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "imparte",
            joinColumns = @JoinColumn(name = "idAsignatura"),
            inverseJoinColumns = @JoinColumn(name = "idProfesor")
    )
    @JsonIgnoreProperties({"id","fechaCreacion","fechaActualizacion","listaAsignaturasImpartidas","listaAsignaturasCoordinadas"})
	private List<Profesor> listaProfesores;
	
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "matricula",
            joinColumns = @JoinColumn(name = "idAsignatura"),
            inverseJoinColumns = @JoinColumn(name = "idAlumno")
    )
    @JsonIgnoreProperties({"id","fechaCreacion","fechaActualizacion","listaAsignaturasMatriculadas"})
	private List<Alumno> listaAlumnos;
    
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "coordina",
            joinColumns = @JoinColumn(name = "idAsignatura"),
            inverseJoinColumns = @JoinColumn(name = "idProfesor")
    )
    @JsonIgnoreProperties({"id","fechaCreacion","fechaActualizacion"})
	private List<Profesor> listaCoordinadores;


	public Asignatura() {
		super();
	}

	public List<Profesor> getListaCoordinadores() {
		return listaCoordinadores;
	}

	public void setListaCoordinadores(List<Profesor> listaCoordinadores) {
		this.listaCoordinadores = listaCoordinadores;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public List<Profesor> getListaProfesores() {
		return listaProfesores;
	}

	public void setListaProfesores(List<Profesor> listaProfesores) {
		this.listaProfesores = listaProfesores;
	}

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	
}
