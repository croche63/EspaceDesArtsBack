package com.inti.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

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


	//@Transient
	@OneToMany(mappedBy = "artiste")
	private Set<Reservation> reservations = new HashSet<>();

	@Transient
	@OneToMany(mappedBy = "artiste")
	private Set<EvaluationArtiste> evaluationArtistes = new HashSet<>();

	//@Transient
	@OneToMany(mappedBy = "artiste")
	private Set<Oeuvre> oeuvres = new HashSet<>();
	
	@Transient
	@OneToOne(mappedBy = "artiste")
	private SalleVirtuelle salleVirtuelle;
	

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

	@JsonIgnore
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

	public SalleVirtuelle getSalleVirtuelle() {
		return salleVirtuelle;
	}

	public void setSalleVirtuelle(SalleVirtuelle salleVirtuelle) {
		this.salleVirtuelle = salleVirtuelle;
	}

}
