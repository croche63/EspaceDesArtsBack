package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Utilisateur;

public interface IUtilisateurService {
	List<Utilisateur> findAll();

	Utilisateur findOne(Long idUtilisateur);

	Utilisateur save(Utilisateur utilisateur);

	void delete(Long idUtilisateur);

	Utilisateur findByUsername(String username);

	List<Utilisateur> findByNom(String nom);

	int nbrUtilisateurs();
}
