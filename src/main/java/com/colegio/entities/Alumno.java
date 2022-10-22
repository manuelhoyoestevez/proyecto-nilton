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
@Table(name = "alumnos")
public class Alumno extends Persona{

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "matricula",
            joinColumns = @JoinColumn(name = "idAlumno"),
            inverseJoinColumns = @JoinColumn(name = "idAsignatura")
    )
    @JsonIgnoreProperties({"id","fechaCreacion","fechaActualizacion"})
	private List<Asignatura> listaAsignaturasMatriculadas;
	
	@Column(name = "nota_media_global")
	private float notaMedia;

	public Alumno() {
		super();
	}

	public List<Asignatura> getListaAsignaturasMatriculadas() {
		return listaAsignaturasMatriculadas;
	}

	public void setListaAsignaturasMatriculadas(List<Asignatura> listaAsignaturasMatriculadas) {
		this.listaAsignaturasMatriculadas = listaAsignaturasMatriculadas;
	}

	public float getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia(float notaMedia) {
		this.notaMedia = notaMedia;
	}
		
}
