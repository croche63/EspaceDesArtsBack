package com.inti.entities;

import java.util.Arrays;

public class Oeuvre {
	private Long idOeuvre;
	private String Nom;
	private String information;
	private Byte[] photoOeuvre;
	private int prix;
	private String type;
	
	
	public Oeuvre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Oeuvre(Long idOeuvre, String nom, String information, Byte[] photoOeuvre, int prix, String type) {
		super();
		this.idOeuvre = idOeuvre;
		Nom = nom;
		this.information = information;
		this.photoOeuvre = photoOeuvre;
		this.prix = prix;
		this.type = type;
	}


	public Long getIdOeuvre() {
		return idOeuvre;
	}


	public void setIdOeuvre(Long idOeuvre) {
		this.idOeuvre = idOeuvre;
	}


	public String getNom() {
		return Nom;
	}


	public void setNom(String nom) {
		Nom = nom;
	}


	public String getInformation() {
		return information;
	}


	public void setInformation(String information) {
		this.information = information;
	}


	public Byte[] getPhotoOeuvre() {
		return photoOeuvre;
	}


	public void setPhotoOeuvre(Byte[] photoOeuvre) {
		this.photoOeuvre = photoOeuvre;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	@Override
	public String toString() {
		return "Oeuvre [idOeuvre=" + idOeuvre + ", Nom=" + Nom + ", information=" + information + ", photoOeuvre="
				+ Arrays.toString(photoOeuvre) + ", prix=" + prix + ", type=" + type + "]";
	}
}

