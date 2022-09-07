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

import com.inti.entities.SignalementOeuvre;
import com.inti.service.impl.SignalementOeuvreService;

@RestController
@CrossOrigin
public class SignalementOeuvreController {
	
	@Autowired
	SignalementOeuvreService signalementOeuvreService;
	
	@GetMapping("/signalementOeuvre")
	public List<SignalementOeuvre> findAll() {
		return signalementOeuvreService.findAll();
	}
	
	@GetMapping("signalementOeuvre/{idU}") 
	public SignalementOeuvre findById(@PathVariable("id")Long id) {
		return signalementOeuvreService.findById(id); 
	}


	@PostMapping("/signalementOeuvre")
	public SignalementOeuvre saveSigOeuvre(@RequestBody SignalementOeuvre signalementOeuvre) {
		return signalementOeuvreService.save(signalementOeuvre);
	}

	@DeleteMapping("/signalementOeuvre/{id}")
	public void deleteSigOeuvre(@PathVariable("id") Long id) {
		signalementOeuvreService.delete(id);
	}

}
