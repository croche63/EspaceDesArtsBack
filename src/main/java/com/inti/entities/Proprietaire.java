package com.inti.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("Proprietaire")
public class Proprietaire extends Utilisateur {

	@Transient
	@OneToMany(mappedBy = "proprietaire")
	private Set<Reservation> reservations = new HashSet<>();
	
	@Transient
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
