package com.inti.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class SalleVirtuelle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private String description;
	
	@Transient
	@OneToMany(mappedBy = "salleVirtuelle")
	private List<SignalementSalleVirtuelle> signalementSalleVirtuelles;
	
	//@Transient
	@OneToMany(mappedBy = "salleVirtuelle")
	private List<CommentaireSalleVirtuelle> commentaireSalleVirtuelles;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Proprietaire proprietaire;
	
	@OneToOne
	private Artiste artiste;
	
	public SalleVirtuelle() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<SignalementSalleVirtuelle> getSignalementSalleVirtuelle() {
		return signalementSalleVirtuelles;
	}

	public void setSignalementSalleVirtuelle(List<SignalementSalleVirtuelle> signalementSalleVirtuelle) {
		this.signalementSalleVirtuelles = signalementSalleVirtuelle;
	}

	public List<CommentaireSalleVirtuelle> getCommentaireSalleVirtuelle() {
		return commentaireSalleVirtuelles;
	}

	public void setCommentaireSalleVirtuelle(List<CommentaireSalleVirtuelle> commentaireSalleVirtuelle) {
		this.commentaireSalleVirtuelles = commentaireSalleVirtuelle;
	}
	
	@JsonIgnore
	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Artiste getArtiste() {
		return artiste;
	}

	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}	
}
