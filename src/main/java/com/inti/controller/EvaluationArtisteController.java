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
import com.inti.entities.EvaluationArtiste;
import com.inti.entities.SalleExposition;
import com.inti.service.interfaces.IArtisteService;
import com.inti.service.interfaces.IEvaluationArtisteService;
import com.inti.service.interfaces.ISalleExpositionService;

@RestController
@CrossOrigin
public class EvaluationArtisteController {
	@Autowired
	IEvaluationArtisteService EvaluationArtisteService;
	
	@Autowired
	IArtisteService artisteService;
	
	@Autowired
	ISalleExpositionService salleExpositionService;

	@GetMapping("/EvaluationArtistes")
	public List<EvaluationArtiste> findAll() {
		return EvaluationArtisteService.findAll();
	}

	@PostMapping("/EvaluationArtistes/{username}/{idSalle}")
	public EvaluationArtiste saveEvaluationArtiste(@RequestBody EvaluationArtiste EvaluationArtiste,
			@PathVariable("username") String username, @PathVariable("idSalle") String id) {
		Artiste artiste = artisteService.findByUsername(username);
		EvaluationArtiste.setArtiste(artiste);
		
		Long idSalleExp = Long.parseLong(id);
		SalleExposition salleExposition = salleExpositionService.findById(idSalleExp);
		EvaluationArtiste.setSalleExposition(salleExposition);
		return EvaluationArtisteService.save(EvaluationArtiste);
	}

	@DeleteMapping("/EvaluationArtistes/{id}")
	public void deleteEvaluationArtiste(@PathVariable("id") Long id) {
		EvaluationArtisteService.delete(id);
	}

}
