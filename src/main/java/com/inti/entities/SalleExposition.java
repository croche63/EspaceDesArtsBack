package com.inti.entities;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.inti.models.Adresse;

@Entity
public class SalleExposition {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private byte[] logo;
	private String dimensionSalle;
	@Embedded
	private Adresse adresse;
	// TODO Liens avec autres classes
		
	public SalleExposition() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public byte[] getLogo() {
		return logo;
	}

	public void setLogo(byte[] logo) {
		this.logo = logo;
	}

	public String getDimensionSalle() {
		return dimensionSalle;
	}

	public void setDimensionSalle(String dimensionSalle) {
		this.dimensionSalle = dimensionSalle;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	
}
