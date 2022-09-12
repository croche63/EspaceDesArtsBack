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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Artiste;
import com.inti.entities.Oeuvre;
import com.inti.entities.SalleExposition;
import com.inti.service.interfaces.ISalleExpositionService;

@RestController
@CrossOrigin
public class SalleExpositionController {
	@Autowired
	ISalleExpositionService SalleExpositionService;

	@GetMapping("/SalleExpositions")
	public List<SalleExposition> findAll() {
		return SalleExpositionService.findAll();
	}
	
	@GetMapping("/SalleExpositions/{id}")
	public SalleExposition findById(@PathVariable("id") Long id) {
		return SalleExpositionService.findById(id);
	}

	@PostMapping("/SalleExpositions")
	public SalleExposition saveSalleExposition(@RequestBody SalleExposition SalleExposition) {
		return SalleExpositionService.save(SalleExposition);
	}

	@PutMapping("/SalleExpositions/{idSalleExpo}") // http://localhost:9090/utilisateurs/2
	public String updateLogo(@RequestParam("logo") MultipartFile logo, @PathVariable("idSalleExpo") Long idSalleExpo) { 
		SalleExposition currentSalleExpo = SalleExpositionService.findById(idSalleExpo);
		try {
			currentSalleExpo.setLogo(logo.getBytes());
			SalleExpositionService.save(currentSalleExpo);
			return "Logo ajouté avec succes!";
		} catch (Exception ex) {
			ex.printStackTrace();
			return "Erreur en ajoutant le logo!";
		}

	}

	
	
	
	@DeleteMapping("/SalleExpositions/{id}")
	public void deleteSalleExposition(@PathVariable("id") Long id) {
		SalleExpositionService.delete(id);
	}
}
