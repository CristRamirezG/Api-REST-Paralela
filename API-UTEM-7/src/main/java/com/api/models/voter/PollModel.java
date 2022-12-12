package com.api.models.voter;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity 
public class PollModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long Token;
	private String Nombre;
	private boolean Activo;
	
	@OneToMany(mappedBy="Id_Poll")
	List<OpcionModel> Id_Opcion;
	
	public Long getToken() {
		return Token;
	}
	public void setToken(Long token) {
		this.Token = token;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public boolean isActivo() {
		return Activo;
	}
	public void setActivo(boolean activo) {
		Activo = activo;
	}
	
	public List<OpcionModel> getId_Opcion() {
		return Id_Opcion;
	}
	public void setId_Opcion(List<OpcionModel> id_Opcion) {
		Id_Opcion = id_Opcion;
	}

}
