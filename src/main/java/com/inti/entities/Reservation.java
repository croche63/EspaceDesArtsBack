package com.inti.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.OneToMany;

public class Reservation {
	private Long idReservation;
	private Date dateDebut;
	private Date dateFin;
	@OneToMany(mappedBy = "reservation")
	private List<Evenement> evenement = new ArrayList<>();
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Long idReservation, Date dateDebut, Date dateFin, List<Evenement> evenement) {
		super();
		this.idReservation = idReservation;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.evenement = evenement;
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

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", dateDebut=" + dateDebut + ", dateFin=" + dateFin
				+ ", evenement=" + evenement + "]";
	}
}
	

