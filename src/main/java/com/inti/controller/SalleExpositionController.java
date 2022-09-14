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
import com.inti.entities.Proprietaire;
import com.inti.entities.SalleExposition;
import com.inti.models.Adresse;
import com.inti.service.interfaces.IProprietaireService;
import com.inti.service.interfaces.ISalleExpositionService;

@RestController
@CrossOrigin
public class SalleExpositionController {
	@Autowired
	ISalleExpositionService SalleExpositionService;
	
	@Autowired
	IProprietaireService proprietaireService;

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
	
	// Nouvelle méthode de sauvegarde:
			@PostMapping("/SalleExpositions/{username}")
			public String saveSalleExposition(@RequestParam("libelle") String libelle, @RequestParam("dimensionSalle") String dimensionSalle,
					@RequestParam("numeroRue") Long numeroRue, @RequestParam("nomRue") String nomRue, @RequestParam("codePostal") Long codePostal,
					@RequestParam("ville") String ville, @RequestParam("pays") String pays,
					@PathVariable("username") String username,
					@RequestParam("logo") MultipartFile logo) { 
				try {
					Adresse adresse = new Adresse();
					adresse.setNumeroRue(numeroRue);
					adresse.setNomRue(nomRue);
					adresse.setCodePostal(codePostal);
					adresse.setVille(ville);
					adresse.setPays(pays);
					
					SalleExposition salleExposition = new SalleExposition();
					salleExposition.setAdresse(adresse);
					salleExposition.setLibelle(libelle);
					salleExposition.setDimensionSalle(dimensionSalle);
					salleExposition.setLogo(logo.getBytes());
					
					Proprietaire proprietaire = proprietaireService.findByUsername(username);
					
					salleExposition.setProprietaire(proprietaire);
					SalleExpositionService.save(salleExposition);
					
					return "Salle d'Exposition ajouté avec success!";
				} catch (Exception ex) {
					ex.printStackTrace();
					return "Erreur en ajoutant la salle!";
				}
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
