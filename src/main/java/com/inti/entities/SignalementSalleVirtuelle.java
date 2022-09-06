package com.inti.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class SignalementSalleVirtuelle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "idSalleVirtuelle")
	private SalleVirtuelle salleVirtuelle;
	
	@ManyToOne
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	
	public SignalementSalleVirtuelle() {
		
	}

	public SignalementSalleVirtuelle(Long id, String titre, String description, Date date) {
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

	public SalleVirtuelle getSalleVirtuelle() {
		return salleVirtuelle;
	}

	public void setSalleVirtuelle(SalleVirtuelle salleVirtuelle) {
		this.salleVirtuelle = salleVirtuelle;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "SignalementSalleVirtuelle [id=" + id + ", titre=" + titre + ", description=" + description + "]";
	}
	
	
	
	

}
