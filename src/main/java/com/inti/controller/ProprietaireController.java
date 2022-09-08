package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Proprietaire;
import com.inti.service.interfaces.IProprietaireService;

@RestController
@CrossOrigin
public class ProprietaireController {
	@Autowired
	IProprietaireService ProprietaireService;

	@GetMapping("/Proprietaires")
	public List<Proprietaire> findAll() {
		return ProprietaireService.findAll();
	}
	
	@GetMapping("/Proprietaires/{username}")
	public Proprietaire findByUsername(@PathVariable("username") String username) {
		return ProprietaireService.findByUsername(username);
	}

	@PostMapping("/Proprietaires")
	public Proprietaire saveProprietaire(@RequestBody Proprietaire Proprietaire) {
		return ProprietaireService.save(Proprietaire);
	}

	@DeleteMapping("/Proprietaires/{id}")
	public void deleteProprietaire(@PathVariable("id") Long id) {
		ProprietaireService.delete(id);
	}

	@PutMapping("/Proprietaire/{id}")
	public void update(@RequestBody Proprietaire proprietaire) {
		Proprietaire current_proprietaire = 
				ProprietaireService.findOne(proprietaire.getId());
		current_proprietaire.setNom(proprietaire.getNom());
		current_proprietaire.setPrenom(proprietaire.getPrenom());
		// etc..
		ProprietaireService.save(current_proprietaire);
	}
}
