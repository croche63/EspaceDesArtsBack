package com.inti.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Reservation {
	private Long idReservation;
	private Date dateDebut;
	private Date dateFin;
	
	@OneToMany(mappedBy = "reservation")
	private List<Evenement> evenement = new ArrayList<>();
	@ManyToOne
	private Proprietaire proprietaire;
	@ManyToOne
	private Artiste artiste;
	@OneToMany
	private SalleExposition salleExposition;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Long idReservation, Date dateDebut, Date dateFin, List<Evenement> evenement,
			Proprietaire proprietaire, Artiste artiste, SalleExposition salleExposition) {
		super();
		this.idReservation = idReservation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.evenement = evenement;
		this.proprietaire = proprietaire;
		this.artiste = artiste;
		this.salleExposition = salleExposition;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public List<Evenement> getEvenement() {
		return evenement;
	}

	public void setEvenement(List<Evenement> evenement) {
		this.evenement = evenement;
	}

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

	public SalleExposition getSalleExposition() {
		return salleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		this.salleExposition = salleExposition;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", evenement=" + evenement + ", proprietaire=" + proprietaire + ", artiste=" + artiste
				+ ", salleExposition=" + salleExposition + "]";
	}
}
	

