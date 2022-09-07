package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.inti.entities.SalleExposition;
import com.inti.service.interfaces.ISalleExpositionService;

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

	@DeleteMapping("/SalleExpositions/{id}")
	public void deleteSalleExposition(@PathVariable("id") Long id) {
		SalleExpositionService.delete(id);
	}
}
