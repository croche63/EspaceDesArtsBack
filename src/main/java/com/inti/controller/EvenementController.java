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

import com.inti.entities.Evenement;
import com.inti.service.interfaces.IEvenementService;

@RestController
@CrossOrigin
public class EvenementController {
	@Autowired
	IEvenementService evenementService;
	
	@GetMapping("/Evenements")
	public List<Evenement> findAll(){
		return evenementService.findAll();
	}
	
	@PostMapping("/Evenements")
	public Evenement saveEvenement(@RequestBody Evenement evenement) {
		return evenementService.save(evenement);
	}
	
	@DeleteMapping("/Evenements/{id}")
	public void deleteEvenement(@PathVariable("id") Long id) {
		evenementService.delete(id);
	}

}
