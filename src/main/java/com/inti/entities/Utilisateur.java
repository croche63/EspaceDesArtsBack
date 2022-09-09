package com.inti.entities;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;

@Entity
@Table(name="Utilisateur",schema = "espaceDesArts")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type",discriminatorType = DiscriminatorType.STRING)
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@Column(unique = true)
	private String username;
	private String password;
	private String email;
	private String numeroTel;
	@Lob
	private byte[] image;

	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private Set<CommentaireSalleExposition> commentaireSalleExpositions = new HashSet<>();
	
	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private Set<SignalementSalleExposition> signalementSalleExpositions = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private Set<CommentaireOeuvre> commentaireOeuvres = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private Set<SignalementOeuvre> signalementOeuvres = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private Set<CommentaireSalleVirtuelle> commentaireSalleVirtuelles = new HashSet<>();

	@OneToMany(mappedBy = "utilisateur")
	@JsonIgnore
	private Set<SignalementSalleVirtuelle> signalementSalleVirtuelles = new HashSet<>();

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "profil", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "Id"), inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "Id"))
	private Set<Role> roles = new HashSet<>();

	public Utilisateur() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumeroTel() {
		return numeroTel;
	}

	public void setNumeroTel(String numeroTel) {
		this.numeroTel = numeroTel;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Set<CommentaireSalleExposition> getCommentaireSalleExpositions() {
		return commentaireSalleExpositions;
	}

	public void setCommentaireSalleExpositions(Set<CommentaireSalleExposition> commentaireSalleExpositions) {
		this.commentaireSalleExpositions = commentaireSalleExpositions;
	}

	public Set<SignalementSalleExposition> getSignalementSalleExpositions() {
		return signalementSalleExpositions;
	}

	public void setSignalementSalleExpositions(Set<SignalementSalleExposition> signalementSalleExpositions) {
		this.signalementSalleExpositions = signalementSalleExpositions;
	}

	public Set<CommentaireOeuvre> getCommentaireOeuvres() {
		return commentaireOeuvres;
	}

	public void setCommentaireOeuvres(Set<CommentaireOeuvre> commentaireOeuvres) {
		this.commentaireOeuvres = commentaireOeuvres;
	}

	public Set<SignalementOeuvre> getSignalementOeuvres() {
		return signalementOeuvres;
	}

	public void setSignalementOeuvres(Set<SignalementOeuvre> signalementOeuvres) {
		this.signalementOeuvres = signalementOeuvres;
	}

	public Set<CommentaireSalleVirtuelle> getCommentaireSalleVirtuelles() {
		return commentaireSalleVirtuelles;
	}

	public void setCommentaireSalleVirtuelles(Set<CommentaireSalleVirtuelle> commentaireSalleVirtuelles) {
		this.commentaireSalleVirtuelles = commentaireSalleVirtuelles;
	}

	public Set<SignalementSalleVirtuelle> getSignalementSalleVirtuelles() {
		return signalementSalleVirtuelles;
	}

	public void setSignalementSalleVirtuelles(Set<SignalementSalleVirtuelle> signalementSalleVirtuelles) {
		this.signalementSalleVirtuelles = signalementSalleVirtuelles;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Utilisateur [Id=" + id + ", Nom=" + nom + ", Prenom=" + prenom + ", Username=" + username
				+ ", Password=" + password + ", Email=" + email + ", NumeroTel=" + numeroTel + ", Image="
				+ Arrays.toString(image) + ", CommentaireSalleExpositions=" + commentaireSalleExpositions
				+ ", SignalementSalleExpositions=" + signalementSalleExpositions + ", CommentaireOeuvres="
				+ commentaireOeuvres + ", SignalementOeuvres=" + signalementOeuvres + ", CommentaireSalleVirtuelles="
				+ commentaireSalleVirtuelles + ", SignalementSalleVirtuelles=" + signalementSalleVirtuelles + ", roles="
				+ roles + "]";
	}

}
