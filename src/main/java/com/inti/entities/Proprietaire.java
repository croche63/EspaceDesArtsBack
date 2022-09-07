package com.inti.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Proprietaire extends Utilisateur {

	@OneToMany(mappedBy = "proprietaire")
	private Set<Reservation> reservations = new HashSet<>();

	@OneToOne(mappedBy = "proprietaire")
	private SalleExposition salleExposition;

	public Proprietaire() {
		super();
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public SalleExposition getSalleExposition() {
		return salleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		this.salleExposition = salleExposition;
	}

	@Override
	public String toString() {
		return "Proprietaire [Reservations=" + reservations + ", SalleExposition=" + salleExposition + "]";
	}

}
