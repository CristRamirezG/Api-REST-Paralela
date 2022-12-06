package com.start.models.voter;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;



@Entity 
public class YaVotoModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	
	private Long id;
	private String Correo;
	
	@ManyToOne
    @JoinColumn(name="Id_Poll", nullable=false)
	private PollModel Id_Poll;
	
	
	public String getCorreo() {
		return Correo;
	}
	public void setJwt(String Correo) {
		this.Correo = Correo ;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id ;
	}

	public PollModel getId_Poll() {
		return Id_Poll;
	}

	public void setId_Poll(PollModel id_Poll) {
		Id_Poll = id_Poll;
	}
}

