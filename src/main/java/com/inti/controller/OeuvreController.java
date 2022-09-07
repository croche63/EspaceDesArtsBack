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
import com.inti.service.interfaces.IOeuvreService;

@RestController
@CrossOrigin
public class OeuvreController {
	@Autowired
	IOeuvreService oeuvreService;
	
	@GetMapping("/Oeuvres")
	public List<Oeuvre> findAll(){
		return oeuvreService.findAll();
	}
	
	@PostMapping("/Oeuvres")
	public Oeuvre saveOeuvre(@RequestBody Oeuvre oeuvre) {
		return oeuvreService.save(oeuvre);
	}
	
	@DeleteMapping("/Oeuvres/{id}")
	public void deleteEvenement(@PathVariable("id") Long id) {
		oeuvreService.delete(id);
	}

}
