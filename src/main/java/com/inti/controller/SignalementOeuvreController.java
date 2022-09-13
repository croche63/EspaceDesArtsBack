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

import com.inti.entities.Oeuvre;
import com.inti.entities.SignalementOeuvre;
import com.inti.entities.Utilisateur;
import com.inti.service.impl.OeuvreService;
import com.inti.service.impl.SignalementOeuvreService;
import com.inti.service.impl.UtilisateurService;

@RestController
@CrossOrigin
public class SignalementOeuvreController {
	
	@Autowired
	SignalementOeuvreService signalementOeuvreService;
	
	@Autowired
	OeuvreService oeuvreService;
	
	@Autowired
	UtilisateurService utilisateurService;
	
	@GetMapping("/signalementOeuvre")
	public List<SignalementOeuvre> findAll() {
		return signalementOeuvreService.findAll();
	}
	
	@GetMapping("signalementOeuvre/{idU}") 
	public SignalementOeuvre findById(@PathVariable("id")Long id) {
		return signalementOeuvreService.findById(id); 
	}


	@PostMapping("/signalementOeuvre/{idOeuvre}/{username}")
	public SignalementOeuvre saveSigOeuvre(@RequestBody SignalementOeuvre signalementOeuvre,
			@PathVariable("idOeuvre") String id, @PathVariable("username") String username) {
		Long idOeuvre = Long.parseLong(id);
		Oeuvre oeuvre = oeuvreService.findOne(idOeuvre);
		Utilisateur utilisateur = utilisateurService.findByUsername(username);
		signalementOeuvre.setOeuvre(oeuvre);
		signalementOeuvre.setUtilisateur(utilisateur);
		return signalementOeuvreService.save(signalementOeuvre);
	}

	@DeleteMapping("/signalementOeuvre/{id}")
	public void deleteSigOeuvre(@PathVariable("id") Long id) {
		signalementOeuvreService.delete(id);
	}

}
