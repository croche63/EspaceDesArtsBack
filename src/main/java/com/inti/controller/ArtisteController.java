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

import com.inti.entities.Artiste;
import com.inti.service.interfaces.IArtisteService;

@RestController
@CrossOrigin
public class ArtisteController {
	@Autowired
	IArtisteService ArtisteService;

	@GetMapping("/Artistes")
	public List<Artiste> findAll() {
		return ArtisteService.findAll();
	}

	@PostMapping("/Artistes")
	public Artiste saveArtiste(@RequestBody Artiste Artiste) {
		return ArtisteService.save(Artiste);
	}

	@DeleteMapping("/Artistes/{id}")
	public void deleteArtiste(@PathVariable("id") Long id) {
		ArtisteService.delete(id);
	}
	
	//Pour trouver l'artiste connecté
	@GetMapping("/Artistes/username/{username}")
	public Artiste findByUsername(@PathVariable("username") String username) {
		return ArtisteService.findByUsername(username);
	}

}
