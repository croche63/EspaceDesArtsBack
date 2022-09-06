package com.inti.entities;

import java.util.Arrays;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

public class Oeuvre {
	private Long idOeuvre;
	private String Nom;
	private String information;
	private Byte[] photoOeuvre;
	private int prix;
	private String type;
	
	@ManyToOne
	private Artiste artiste;
	@OneToMany
	private CommentaireOeuvre commentaireOeuvre;
	@ManyToOne
	private SalleExposition salleExposition;
	@OneToMany
	private SignalementOeuvre signalementOeuvre;
	@ManyToOne
	private SalleVirtuelle salleVirtuelle;
	
	
	
	public Oeuvre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oeuvre(Long idOeuvre, String nom, String information, Byte[] photoOeuvre, int prix, String type,
			Artiste artiste, CommentaireOeuvre commentaireOeuvre, SalleExposition salleExposition,
			SignalementOeuvre signalementOeuvre, SalleVirtuelle salleVirtuelle) {
		super();
		this.idOeuvre = idOeuvre;
		Nom = nom;
		this.information = information;
		this.photoOeuvre = photoOeuvre;
		this.prix = prix;
		this.type = type;
		this.artiste = artiste;
		this.commentaireOeuvre = commentaireOeuvre;
		this.salleExposition = salleExposition;
		this.signalementOeuvre = signalementOeuvre;
		this.salleVirtuelle = salleVirtuelle;
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


	public Artiste getArtiste() {
		return artiste;
	}

	public void setArtiste(Artiste artiste) {
		this.artiste = artiste;
	}

	public CommentaireOeuvre getCommentaireOeuvre() {
		return commentaireOeuvre;
	}

	public void setCommentaireOeuvre(CommentaireOeuvre commentaireOeuvre) {
		this.commentaireOeuvre = commentaireOeuvre;
	}

	public SalleExposition getSalleExposition() {
		return salleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		this.salleExposition = salleExposition;
	}

	public SignalementOeuvre getSignalementOeuvre() {
		return signalementOeuvre;
	}

	public void setSignalementOeuvre(SignalementOeuvre signalementOeuvre) {
		this.signalementOeuvre = signalementOeuvre;
	}

	public SalleVirtuelle getSalleVirtuelle() {
		return salleVirtuelle;
	}

	public void setSalleVirtuelle(SalleVirtuelle salleVirtuelle) {
		this.salleVirtuelle = salleVirtuelle;
	}

	@Override
	public String toString() {
		return "Oeuvre [idOeuvre=" + idOeuvre + ", Nom=" + Nom + ", information=" + information + ", photoOeuvre="
				+ Arrays.toString(photoOeuvre) + ", prix=" + prix + ", type=" + type + ", artiste=" + artiste
				+ ", commentaireOeuvre=" + commentaireOeuvre + ", salleExposition=" + salleExposition
				+ ", signalementOeuvre=" + signalementOeuvre + ", salleVirtuelle=" + salleVirtuelle + "]";
	}
}

