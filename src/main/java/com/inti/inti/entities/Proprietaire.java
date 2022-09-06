package com.inti.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Proprietaire extends Utilisateur {

	@OneToMany(mappedBy = "proprietaire")
	private Set<Reservation> Reservations = new HashSet<>();

	@OneToOne(mappedBy = "proprietaire")
	private SalleExposition SalleExposition;

	public Proprietaire() {
		super();
	}

	public Set<Reservation> getReservations() {
		return Reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		Reservations = reservations;
	}

	public SalleExposition getSalleExposition() {
		return SalleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		SalleExposition = salleExposition;
	}

	@Override
	public String toString() {
		return "Proprietaire [Reservations=" + Reservations + ", SalleExposition=" + SalleExposition + "]";
	}

}
