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

import com.inti.entities.Proprietaire;
import com.inti.entities.SalleVirtuelle;
import com.inti.service.interfaces.IProprietaireService;
import com.inti.service.interfaces.ISalleVirtuelleService;

@RestController
@CrossOrigin
public class SalleVirtuelleController {
	@Autowired
	ISalleVirtuelleService SalleVirtuelleService;
	
	@Autowired
	IProprietaireService proprietaireService;

	@GetMapping("/SalleVirtuelles")
	public List<SalleVirtuelle> findAll() {
		return SalleVirtuelleService.findAll();
	}
	
	@GetMapping("/SalleVirtuelles/{id}")
	public SalleVirtuelle findById(@PathVariable("id") Long id) {
		return SalleVirtuelleService.findById(id);
	}

	@PostMapping("/SalleVirtuelles/{username}")
	public SalleVirtuelle saveSalleVirtuelle(@RequestBody SalleVirtuelle SalleVirtuelle, @PathVariable("username") String username) {
		Proprietaire proprietaire = proprietaireService.findByUsername(username);
		SalleVirtuelle.setProprietaire(proprietaire);
		return SalleVirtuelleService.save(SalleVirtuelle);
	}

	@DeleteMapping("/SalleVirtuelles/{id}")
	public void deleteSalleVirtuelle(@PathVariable("id") Long id) {
		SalleVirtuelleService.delete(id);
	}
}
