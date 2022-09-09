package com.inti.entities;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.inti.models.Adresse;

@Entity
public class SalleExposition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	@Lob
	private byte[] logo;
	private String dimensionSalle;
	@Embedded
	private Adresse adresse;
	
	@OneToOne
	private Proprietaire proprietaire;
	
	@Transient
	@OneToMany(mappedBy = "salleExposition")
	private List<SignalementSalleExposition> signalementSalleExposition;
	
	@Transient
	@OneToMany(mappedBy = "salleExposition")
	private List<Reservation> reservation;
	
	@Transient
	@OneToMany(mappedBy = "salleExposition")
	private List<EvaluationArtiste> evaluationArtiste;
	
	@Transient
	@OneToMany(mappedBy = "salleExposition")
	private List<CommentaireSalleExposition> commentaireSalleExposition;
	
	@Transient
	@OneToMany(mappedBy = "salleExposition")
	private List<Oeuvre> oeuvre;
		
	public SalleExposition() {}

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

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getDimensionSalle() {
		return dimensionSalle;
	}

	public void setDimensionSalle(String dimensionSalle) {
		this.dimensionSalle = dimensionSalle;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Proprietaire getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Proprietaire proprietaire) {
		this.proprietaire = proprietaire;
	}

	public List<SignalementSalleExposition> getSignalementSalleExposition() {
		return signalementSalleExposition;
	}

	public void setSignalementSalleExposition(List<SignalementSalleExposition> signalementSalleExposition) {
		this.signalementSalleExposition = signalementSalleExposition;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	public List<EvaluationArtiste> getEvaluationArtiste() {
		return evaluationArtiste;
	}

	public void setEvaluationArtiste(List<EvaluationArtiste> evaluationArtiste) {
		this.evaluationArtiste = evaluationArtiste;
	}

	public List<CommentaireSalleExposition> getCommentaireSalleExposition() {
		return commentaireSalleExposition;
	}

	public void setCommentaireSalleExposition(List<CommentaireSalleExposition> commentaireSalleExposition) {
		this.commentaireSalleExposition = commentaireSalleExposition;
	}

	public List<Oeuvre> getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(List<Oeuvre> oeuvre) {
		this.oeuvre = oeuvre;
	}
}
