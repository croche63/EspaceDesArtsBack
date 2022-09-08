package com.inti.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.inti.models.Adresse;

@Entity
@DiscriminatorValue("Artiste")
public class Artiste extends Utilisateur {
	private String nationalite;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dateNaisance;
	private Adresse adresse;
	
	//@JsonIgnore
	@OneToMany(mappedBy = "artiste")
	private Set<Reservation> reservations = new HashSet<>();

	@OneToMany(mappedBy = "artiste")
	private Set<EvaluationArtiste> evaluationArtistes = new HashSet<>();

	@OneToMany(mappedBy = "artiste")
	private Set<Oeuvre> oeuvres = new HashSet<>();

	public Artiste() {
		super();
	}

	public String getNationalite() {
		return nationalite;
	}

	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public Set<EvaluationArtiste> getEvaluationArtistes() {
		return evaluationArtistes;
	}

	public void setEvaluationArtistes(Set<EvaluationArtiste> evaluationArtistes) {
		this.evaluationArtistes = evaluationArtistes;
	}

	public Set<Oeuvre> getOeuvres() {
		return oeuvres;
	}

	public void setOeuvres(Set<Oeuvre> oeuvres) {
		this.oeuvres = oeuvres;
	}

	public Date getDateNaisance() {
		return dateNaisance;
	}

	public void setDateNaisance(Date dateNaisance) {
		this.dateNaisance = dateNaisance;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
