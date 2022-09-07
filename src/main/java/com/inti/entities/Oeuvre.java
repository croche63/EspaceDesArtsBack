package com.inti.entities;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Oeuvre {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOeuvre;
	private String nom;
	private String information;
	private Byte[] photoOeuvre;
	private int prix;
	private String type;
	
	@ManyToOne
	private Artiste artiste;
	@OneToMany(mappedBy = "oeuvre")
	private List<CommentaireOeuvre> commentaireOeuvre;
	@ManyToOne
	private SalleExposition salleExposition;
	@OneToMany(mappedBy = "oeuvre")
	private List<SignalementOeuvre> signalementOeuvre;
	@ManyToOne
	private SalleVirtuelle salleVirtuelle;

	public Oeuvre() {}





	public Oeuvre(Long idOeuvre, String nom, String information, Byte[] photoOeuvre, int prix, String type,
			Artiste artiste, List<CommentaireOeuvre> commentaireOeuvre, SalleExposition salleExposition,
			List<SignalementOeuvre> signalementOeuvre, SalleVirtuelle salleVirtuelle) {
		super();
		this.idOeuvre = idOeuvre;
		this.nom = nom;
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
		return nom;
	}





	public void setNom(String nom) {
		this.nom = nom;
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

	
	public SalleExposition getSalleExposition() {
		return salleExposition;
	}

	public void setSalleExposition(SalleExposition salleExposition) {
		this.salleExposition = salleExposition;
	}

	public SalleVirtuelle getSalleVirtuelle() {
		return salleVirtuelle;
	}

	public void setSalleVirtuelle(SalleVirtuelle salleVirtuelle) {
		this.salleVirtuelle = salleVirtuelle;
	}
	

	public List<CommentaireOeuvre> getCommentaireOeuvre() {
		return commentaireOeuvre;
	}



	public void setCommentaireOeuvre(List<CommentaireOeuvre> commentaireOeuvre) {
		this.commentaireOeuvre = commentaireOeuvre;
	}



	public List<SignalementOeuvre> getSignalementOeuvre() {
		return signalementOeuvre;
	}



	public void setSignalementOeuvre(List<SignalementOeuvre> signalementOeuvre) {
		this.signalementOeuvre = signalementOeuvre;
	}





	@Override
	public String toString() {
		return "Oeuvre [idOeuvre=" + idOeuvre + ", nom=" + nom + ", information=" + information + ", photoOeuvre="
				+ Arrays.toString(photoOeuvre) + ", prix=" + prix + ", type=" + type + ", artiste=" + artiste
				+ ", commentaireOeuvre=" + commentaireOeuvre + ", salleExposition=" + salleExposition
				+ ", signalementOeuvre=" + signalementOeuvre + ", salleVirtuelle=" + salleVirtuelle + "]";
	}





}

