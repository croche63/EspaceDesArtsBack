package com.inti.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String Nom;
	private String Prenom;
	@Column(unique = true)
	private String Username;
	private String Password;
	private String Email;
	private String NumeroTel;
	@Lob
	private byte[] Image;

	@OneToMany(mappedBy = "utilisateur")
	private Set<CommentaireSalleExposition> CommentaireSalleExpositions = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	private Set<SignalementSalleExposition> SignalementSalleExpositions = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	private Set<CommentaireOeuvre> CommentaireOeuvres = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	private Set<SignalementOeuvre> SignalementOeuvres = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	private Set<CommentaireSalleVirtuelle> CommentaireSalleVirtuelles = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	private Set<SignalementSalleVirtuelle> SignalementSalleVirtuelles = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profil", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "Id"), inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "Id"))
	private Set<Role> roles = new HashSet<>();

	public Utilisateur() {
		super();
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNumeroTel() {
		return NumeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		NumeroTel = numeroTel;
	}

	public byte[] getImage() {
		return Image;
	}

	public void setImage(byte[] image) {
		Image = image;
	}

	public Set<CommentaireSalleExposition> getCommentaireSalleExpositions() {
		return CommentaireSalleExpositions;
	}

	public void setCommentaireSalleExpositions(Set<CommentaireSalleExposition> commentaireSalleExpositions) {
		CommentaireSalleExpositions = commentaireSalleExpositions;
	}

	public Set<SignalementSalleExposition> getSignalementSalleExpositions() {
		return SignalementSalleExpositions;
	}

	public void setSignalementSalleExpositions(Set<SignalementSalleExposition> signalementSalleExpositions) {
		SignalementSalleExpositions = signalementSalleExpositions;
	}

	public Set<CommentaireOeuvre> getCommentaireOeuvres() {
		return CommentaireOeuvres;
	}

	public void setCommentaireOeuvres(Set<CommentaireOeuvre> commentaireOeuvres) {
		CommentaireOeuvres = commentaireOeuvres;
	}

	public Set<SignalementOeuvre> getSignalementOeuvres() {
		return SignalementOeuvres;
	}

	public void setSignalementOeuvres(Set<SignalementOeuvre> signalementOeuvres) {
		SignalementOeuvres = signalementOeuvres;
	}

	public Set<CommentaireSalleVirtuelle> getCommentaireSalleVirtuelles() {
		return CommentaireSalleVirtuelles;
	}

	public void setCommentaireSalleVirtuelles(Set<CommentaireSalleVirtuelle> commentaireSalleVirtuelles) {
		CommentaireSalleVirtuelles = commentaireSalleVirtuelles;
	}

	public Set<SignalementSalleVirtuelle> getSignalementSalleVirtuelles() {
		return SignalementSalleVirtuelles;
	}

	public void setSignalementSalleVirtuelles(Set<SignalementSalleVirtuelle> signalementSalleVirtuelles) {
		SignalementSalleVirtuelles = signalementSalleVirtuelles;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Utilisateur [Id=" + Id + ", Nom=" + Nom + ", Prenom=" + Prenom + ", Username=" + Username
				+ ", Password=" + Password + ", Email=" + Email + ", NumeroTel=" + NumeroTel + ", Image="
				+ Arrays.toString(Image) + ", CommentaireSalleExpositions=" + CommentaireSalleExpositions
				+ ", SignalementSalleExpositions=" + SignalementSalleExpositions + ", CommentaireOeuvres="
				+ CommentaireOeuvres + ", SignalementOeuvres=" + SignalementOeuvres + ", CommentaireSalleVirtuelles="
				+ CommentaireSalleVirtuelles + ", SignalementSalleVirtuelles=" + SignalementSalleVirtuelles + ", roles="
				+ roles + "]";
	}

}
