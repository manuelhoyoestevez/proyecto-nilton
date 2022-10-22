package com.colegio.model;

public enum Errores {

	NO_ENCONTRADO(1L,"No encontrado"),
	DESCONOCIDO(2L,"Desconocido"),
	VACIO(3L,"Lista vacia");
	
	private Long id;
	private String mensaje;
	
	private Errores(Long id, String mensaje) {
		this.id = id;
		this.mensaje = mensaje;
	}
	
	public Long getId() {
		return id;
	}

	public String getMensaje() {
		return mensaje;
	}
	
}
