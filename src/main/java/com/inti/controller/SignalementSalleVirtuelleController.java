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

import com.inti.entities.SignalementSalleVirtuelle;
import com.inti.service.impl.SignalementSalleVirtuelleService;

@RestController
@CrossOrigin
public class SignalementSalleVirtuelleController {
	
	@Autowired
	SignalementSalleVirtuelleService signalementSalleVirtuelleService;
	
	@GetMapping("/signalementSalleVirt")
	public List<SignalementSalleVirtuelle> findAll() {
		return signalementSalleVirtuelleService.findAll();
	}
	
	@GetMapping("signalementSalleVirt/{idU}") 
	public SignalementSalleVirtuelle findById(@PathVariable("id")Long id) {
		return signalementSalleVirtuelleService.findById(id); 
	}


	@PostMapping("/signalementSalleVirt")
	public SignalementSalleVirtuelle saveSigSalleVirt(@RequestBody SignalementSalleVirtuelle signalementSalleVirtuelle) {
		return signalementSalleVirtuelleService.save(signalementSalleVirtuelle);
	}

	@DeleteMapping("/signalementSalleVirt/{id}")
	public void deleteSigSalleVirt(@PathVariable("id") Long id) {
		signalementSalleVirtuelleService.delete(id);
	}

}
