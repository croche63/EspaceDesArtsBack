package com.inti.models;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private Long numeroRue;
	private String nomRue;
	private Long codePostal;
	private String ville;
	private String pays;

	public Adresse() {
	}

	public String getNomRue() {
		return nomRue;
	}

	public void setNomRue(String nomRue) {
		this.nomRue = nomRue;
	}

	public Long getNumeroRue() {
		return numeroRue;
	}

	public void setNumeroRue(Long numeroRue) {
		this.numeroRue = numeroRue;
	}

	public Long getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Long codePostal) {
		this.codePostal = codePostal;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
