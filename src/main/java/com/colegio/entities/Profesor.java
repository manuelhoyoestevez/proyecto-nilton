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
@Table(name = "profesores")
public class Profesor extends Persona{


	@ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
    		name = "imparte",
            joinColumns = @JoinColumn(name = "idProfesor", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "idAsignatura", nullable = false)
    )
    @JsonIgnoreProperties({"id","fechaCreacion","fechaActualizacion"})
	private List<Asignatura> listaAsignaturasImpartidas;
	
	@Column(name = "jefe_de_departamento")
	private Boolean jefeDepartamento;
	
	
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "coordina",
            joinColumns = @JoinColumn(name = "idProfesor", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "idAsignatura", nullable = false)
    )
    @JsonIgnoreProperties({"id","fechaCreacion","fechaActualizacion"})
    private List<Asignatura> listaAsignaturasCoordinadas;

	public Profesor() {
		super();
	}


	public List<Asignatura> getListaAsignaturasImpartidas() {
		return listaAsignaturasImpartidas;
	}


	public void setListaAsignaturasImpartidas(List<Asignatura> listaAsignaturasImpartidas) {
		this.listaAsignaturasImpartidas = listaAsignaturasImpartidas;
	}


	public List<Asignatura> getListaAsignaturasCoordinadas() {
		return listaAsignaturasCoordinadas;
	}


	public void setListaAsignaturasCoordinadas(List<Asignatura> listaAsignaturasCoordinadas) {
		this.listaAsignaturasCoordinadas = listaAsignaturasCoordinadas;
	}


	public Boolean getJefeDepartamento() {
		return jefeDepartamento;
	}

	public void setJefeDepartamento(Boolean jefeDepartamento) {
		this.jefeDepartamento = jefeDepartamento;
	}
	
	
}
