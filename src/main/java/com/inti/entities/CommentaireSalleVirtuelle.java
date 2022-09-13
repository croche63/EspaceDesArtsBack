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
public class CommentaireSalleVirtuelle implements Serializable {
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
	@JoinColumn(name = "idSalleVirtuelle")
	private SalleVirtuelle salleVirtuelle;

	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;

	public CommentaireSalleVirtuelle() {
		date = new Date();

	}

	public CommentaireSalleVirtuelle(Long id, String titre, String description, int note, Date date) {
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.note = note;
		this.date = date;
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
	public SalleVirtuelle getSalleVirtuelle() {
		return salleVirtuelle;
	}

	public void setSalleVirtuelle(SalleVirtuelle salleVirtuelle) {
		this.salleVirtuelle = salleVirtuelle;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}



}
