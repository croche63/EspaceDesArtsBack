package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.CommentaireSalleExposition;
import com.inti.entities.SalleExposition;
import com.inti.entities.Utilisateur;
import com.inti.service.impl.CommentaireSalleExpositionService;
import com.inti.service.impl.SalleExpositionService;
import com.inti.service.impl.UtilisateurService;

@RestController
@CrossOrigin
public class CommentaireSalleExpositionController {

	@Autowired
	CommentaireSalleExpositionService commentaireSalleExpositionService;

	@Autowired
	SalleExpositionService salleExpoService;

	@Autowired
	UtilisateurService utilisateurService;

	@GetMapping("/commentaireSalleExp")
	public List<CommentaireSalleExposition> findAll() {
		return commentaireSalleExpositionService.findAll();
	}

	@GetMapping("commentaireSalleExp/{idU}")
	public CommentaireSalleExposition findById(@PathVariable("id") Long id) {
		return commentaireSalleExpositionService.findById(id);
	}

	@PostMapping("/commentaireSalleExp/{idSalleExpo}/{username}")
	public CommentaireSalleExposition saveCommSalleExp(
			@RequestBody CommentaireSalleExposition commentaireSalleExposition, @PathVariable("idSalleVirt") Long id,
			@PathVariable("username") String username) {
		SalleExposition salleExpo = salleExpoService.findById(id);
		Utilisateur utilisateur = utilisateurService.findByUsername(username);
		commentaireSalleExposition.setUtilisateur(utilisateur);
		commentaireSalleExposition.setSalleExposition(salleExpo);
		return commentaireSalleExpositionService.save(commentaireSalleExposition);
	}

	@DeleteMapping("/commentaireSalleExp/{id}")
	public void deleteCommSalleExp(@PathVariable("id") Long id) {
		commentaireSalleExpositionService.delete(id);
	}

}
