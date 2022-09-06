package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SignalementSalleExposition implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "idSalleExposition")
	private SalleExposition salleExposition;
	
	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	
	public SignalementSalleExposition() {
		
	}

	public SignalementSalleExposition(Long id, String titre, String description, Date date) {
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public SalleExposition getSalleExposition() {
		return salleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		this.salleExposition = salleExposition;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "SignalementSalleExposition [id=" + id + ", titre=" + titre + ", description=" + description + ", date="
				+ date + "]";
	}
	
	
	
	

}
