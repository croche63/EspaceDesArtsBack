package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Artiste;
import com.inti.entities.Oeuvre;
import com.inti.service.interfaces.IArtisteService;
import com.inti.service.interfaces.IOeuvreService;

@RestController
@CrossOrigin
public class OeuvreController {
	@Autowired
	IOeuvreService oeuvreService;
	
	@Autowired
	IArtisteService artisteService;
	
	@GetMapping("/Oeuvres")
	public List<Oeuvre> findAll(){
		return oeuvreService.findAll();
	}
	
	/*@PostMapping("/Oeuvres")
	public Oeuvre saveOeuvre(@RequestBody Oeuvre oeuvre) {
		return oeuvreService.save(oeuvre);
	}*/
	
	// Nouvelle méthode de sauvegarde:
		@PostMapping("/Oeuvres")
		public String saveOeuvre(@RequestParam("nom") String nom, @RequestParam("type") String type,
				@RequestParam("information") String information, @RequestParam("prix") int prix,
				@RequestParam("fileU") MultipartFile image) { //+ @RequestParam("username") String username
			try {
				Oeuvre currentOeuvre = new Oeuvre();
				currentOeuvre.setNom(nom);
				currentOeuvre.setType(type);
				currentOeuvre.setInformation(information);
				currentOeuvre.setPrix(prix);
				currentOeuvre.setImage(image.getBytes());
				
				/*Artiste artiste = artisteService.findByUsername(username);
				currentOeuvre.setArtiste(artiste);*/
				
				oeuvreService.save(currentOeuvre);
				return "Oeuvre ajouté à votre portfolio avec success!";
			} catch (Exception ex) {
				ex.printStackTrace();
				return "Erreur en ajoutant la photo!";
			}
		}
	
	@DeleteMapping("/Oeuvres/{id}")
	public void deleteOeuvre(@PathVariable("id") Long id) {
		oeuvreService.delete(id);
	}

	@GetMapping("/Oeuvres/nom/{nom}")
	public Oeuvre findByName(@PathVariable("nom") String nom) {
		return oeuvreService.findByNom(nom);
	}
}
