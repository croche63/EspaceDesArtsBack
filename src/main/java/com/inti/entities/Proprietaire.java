package com.inti.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@DiscriminatorValue("Proprietaire")
public class Proprietaire extends Utilisateur {
	
	@Transient
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
