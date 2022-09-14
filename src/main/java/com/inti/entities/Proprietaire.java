package com.inti.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Proprietaire")
public class Proprietaire extends Utilisateur {

	@OneToOne(mappedBy = "proprietaire")
	private SalleExposition salleExposition;

	public Proprietaire() {
		super();
	}

	public SalleExposition getSalleExposition() {
		return salleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		this.salleExposition = salleExposition;
	}

}
