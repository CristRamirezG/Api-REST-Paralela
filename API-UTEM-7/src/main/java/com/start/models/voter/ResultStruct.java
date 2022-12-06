package com.start.models.voter;

import java.util.List;

public class ResultStruct {
	private String nombreEncuesta;
	private List <String> Opciones;
	
	public String getNombreEncuesta() {
		return nombreEncuesta;
	}
	public void setNombreEncuesta(String nombreEncuesta) {
		this.nombreEncuesta = nombreEncuesta;
	}
	public List <String> getOpciones() {
		return Opciones;
	}
	public void setOpciones(List <String> opciones) {
		Opciones = opciones;
	}
}
