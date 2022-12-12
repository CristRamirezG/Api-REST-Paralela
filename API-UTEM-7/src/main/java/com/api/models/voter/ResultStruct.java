package com.api.models.voter;

import java.util.List;

public class ResultStruct {
	private String nombreEncuesta;
	private List <OpcionModel> Opciones;
	
	public String getNombreEncuesta() {
		return nombreEncuesta;
	}
	public void setNombreEncuesta(String nombreEncuesta) {
		this.nombreEncuesta = nombreEncuesta;
	}
	public List <OpcionModel> getOpciones() {
		return Opciones;
	}
	public void setOpciones(List <OpcionModel> opciones) {
		Opciones = opciones;
	}
}
