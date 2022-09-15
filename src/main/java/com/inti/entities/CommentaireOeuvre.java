package com.inti.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CommentaireOeuvre implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	private int note;
	@DateTimeFormat(pattern = "dd/MM/yyyy HH:mm")
	@Temporal(TemporalType.DATE)
	private Date date;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "idOeuvre")
	@JsonIgnore
	private Oeuvre oeuvre;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;

	public CommentaireOeuvre() {
		date = new Date();

	}

	public CommentaireOeuvre(Long id, String titre, String description, int note) {
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.note = note;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNote() {
		return note;
	}

	public void setNote(int note) {
		this.note = note;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	@JsonIgnore
	public Oeuvre getOeuvre() {
		return oeuvre;
	}

	public void setOeuvre(Oeuvre oeuvre) {
		this.oeuvre = oeuvre;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	

}
