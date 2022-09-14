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

import com.inti.entities.SalleExposition;
import com.inti.entities.SignalementSalleExposition;
import com.inti.entities.Utilisateur;
import com.inti.service.impl.SalleExpositionService;
import com.inti.service.impl.SignalementSalleExpositionService;
import com.inti.service.impl.UtilisateurService;

@RestController
@CrossOrigin
public class SignalementSalleExpositionController {

	@Autowired
	SignalementSalleExpositionService signalementSalleExpositionService;

	@Autowired
	SalleExpositionService salleExpositionService;

	@Autowired
	UtilisateurService utilisateurService;

	@GetMapping("/signalementSalleExp")
	public List<SignalementSalleExposition> findAll() {
		return signalementSalleExpositionService.findAll();
	}

	@GetMapping("signalementSalleExp/{idU}")
	public SignalementSalleExposition findById(@PathVariable("id") Long id) {
		return signalementSalleExpositionService.findById(id);
	}

	@PostMapping("/signalementSalleExp/{idSalleExpo}/{username}")
	public SignalementSalleExposition saveSigSalleExp(
			@RequestBody SignalementSalleExposition signalementSalleExposition, @PathVariable("idSalleExpo") Long id,
			@PathVariable("username") String username) {
		SalleExposition salleExpo = salleExpositionService.findById(id);
		Utilisateur utilisateur = utilisateurService.findByUsername(username);
		signalementSalleExposition.setUtilisateur(utilisateur);
		signalementSalleExposition.setSalleExposition(salleExpo);
		return signalementSalleExpositionService.save(signalementSalleExposition);
	}

	@DeleteMapping("/signalementSalleExp/{id}")
	public void deleteSigSalleExp(@PathVariable("id") Long id) {
		signalementSalleExpositionService.delete(id);
	}

}
