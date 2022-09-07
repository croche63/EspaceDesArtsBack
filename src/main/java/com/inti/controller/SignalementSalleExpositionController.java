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

import com.inti.entities.SignalementSalleExposition;
import com.inti.service.impl.SignalementSalleExpositionService;

@RestController
@CrossOrigin
public class SignalementSalleExpositionController {
	
	@Autowired
	SignalementSalleExpositionService signalementSalleExpositionService;
	
	@GetMapping("/signalementSalleExp")
	public List<SignalementSalleExposition> findAll() {
		return signalementSalleExpositionService.findAll();
	}
	
	@GetMapping("signalementSalleExp/{idU}") 
	public SignalementSalleExposition findById(@PathVariable("id")Long id) {
		return signalementSalleExpositionService.findById(id); 
	}


	@PostMapping("/signalementSalleExp")
	public SignalementSalleExposition saveSigSalleExp(@RequestBody SignalementSalleExposition signalementSalleExposition) {
		return signalementSalleExpositionService.save(signalementSalleExposition);
	}

	@DeleteMapping("/signalementSalleExp/{id}")
	public void deleteSigSalleExp(@PathVariable("id") Long id) {
		signalementSalleExpositionService.delete(id);
	}

}
