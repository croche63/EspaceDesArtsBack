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

import com.inti.entities.EvaluationArtiste;
import com.inti.service.interfaces.IEvaluationArtisteService;

@RestController
@CrossOrigin
public class EvaluationArtisteController {
	@Autowired
	IEvaluationArtisteService EvaluationArtisteService;

	@GetMapping("/EvaluationArtistes")
	public List<EvaluationArtiste> findAll() {
		return EvaluationArtisteService.findAll();
	}

	@PostMapping("/EvaluationArtistes")
	public EvaluationArtiste saveEvaluationArtiste(@RequestBody EvaluationArtiste EvaluationArtiste) {
		return EvaluationArtisteService.save(EvaluationArtiste);
	}

	@DeleteMapping("/EvaluationArtistes/{id}")
	public void deleteEvaluationArtiste(@PathVariable("id") Long id) {
		EvaluationArtisteService.delete(id);
	}

}
