package com.inti.entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Artiste extends Utilisateur {
	private String Nationalite;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
	private Date dateNaisance;

	@OneToMany(mappedBy = "artiste")
	private Set<Reservation> Reservations = new HashSet<>();

	@OneToMany(mappedBy = "artiste")
	private Set<EvaluationArtiste> EvaluationArtistes = new HashSet<>();

	@OneToMany(mappedBy = "artiste")
	private Set<Oeuvre> Oeuvres = new HashSet<>();

	public Artiste() {
		super();
	}

	public String getNationalite() {
		return Nationalite;
	}

	public void setNationalite(String nationalite) {
		Nationalite = nationalite;
	}

	public Set<Reservation> getReservations() {
		return Reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		Reservations = reservations;
	}

	public Set<EvaluationArtiste> getEvaluationArtistes() {
		return EvaluationArtistes;
	}

	public void setEvaluationArtistes(Set<EvaluationArtiste> evaluationArtistes) {
		EvaluationArtistes = evaluationArtistes;
	}

	public Set<Oeuvre> getOeuvres() {
		return Oeuvres;
	}

	public void setOeuvres(Set<Oeuvre> oeuvres) {
		Oeuvres = oeuvres;
	}

	public Date getDateNaisance() {
		return dateNaisance;
	}

	public void setDateNaisance(Date dateNaisance) {
		this.dateNaisance = dateNaisance;
	}

	@Override
	public String toString() {
		return "Artiste [Nationalite=" + Nationalite + ", dateNaisance=" + dateNaisance + ", Reservations="
				+ Reservations + ", EvaluationArtistes=" + EvaluationArtistes + ", Oeuvres=" + Oeuvres + "]";
	}

}
