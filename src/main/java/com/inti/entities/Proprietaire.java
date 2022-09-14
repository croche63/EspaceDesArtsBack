package com.inti.entities;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("Proprietaire")
public class Proprietaire extends Utilisateur {

	@OneToOne(mappedBy = "proprietaire")
	private SalleExposition salleExposition;
	
	@OneToMany(mappedBy = "proprietaire")
	private List<SalleVirtuelle> SalleVirtuelles;

	public Proprietaire() {
		super();
	}

	public SalleExposition getSalleExposition() {
		return salleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		this.salleExposition = salleExposition;
	}

	public List<SalleVirtuelle> getSalleVirtuelles() {
		return SalleVirtuelles;
	}

	public void setSalleVirtuelles(List<SalleVirtuelle> salleVirtuelles) {
		SalleVirtuelles = salleVirtuelles;
	}
	
	

}
