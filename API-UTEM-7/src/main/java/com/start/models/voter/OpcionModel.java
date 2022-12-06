package com.start.models.voter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity 
public class OpcionModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Long id;
	private Long Numero_Opcion;
	private String Descripcion;
	private Long Cant_Votos;
	@ManyToOne
    @JoinColumn(name="Id_Poll", nullable=false)
	private PollModel Id_Poll;
	

	public Long getNumero_Opcion() {
		return Numero_Opcion;
	}

	public void setNumero_Opcion(Long numero_Opcion) {
		Numero_Opcion = numero_Opcion;
	}

	public PollModel getId_Poll() {
		return Id_Poll;
	}

	public void setId_Poll(PollModel id_Poll) {
		Id_Poll = id_Poll;
	}

	public Long getCant_Votos() {
		return Cant_Votos;
	}

	public void setCant_Votos(Long cant_Votos) {
		Cant_Votos = cant_Votos;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
