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

import com.inti.entities.CommentaireSalleVirtuelle;
import com.inti.entities.SalleVirtuelle;
import com.inti.service.impl.CommentaireSalleVirtuelleService;
import com.inti.service.impl.SalleVirtuelleService;


@RestController
@CrossOrigin
public class CommentaireSalleVirtuelleController {
	
	@Autowired
	CommentaireSalleVirtuelleService commentaireSalleVirtuelleService;
	
	@Autowired
	SalleVirtuelleService salleVirtuelleService;
	
	@GetMapping("/commentaireSalleVirt")
	public List<CommentaireSalleVirtuelle> findAll() {
		return commentaireSalleVirtuelleService.findAll();
	}
	
	@GetMapping("commentaireSalleVirt/{idU}") 
	public CommentaireSalleVirtuelle findById(@PathVariable("id")Long id) {
		return commentaireSalleVirtuelleService.findById(id); 
	}


	@PostMapping("/commentaireSalleVirt/{idSalleVirt}")
	public CommentaireSalleVirtuelle saveCommSalleVirt(@RequestBody CommentaireSalleVirtuelle commentaireSalleVirtuelle,
			@PathVariable("idSalleVirt") Long id) {
		SalleVirtuelle salleVirtuelle = salleVirtuelleService.findById(id);
		commentaireSalleVirtuelle.setSalleVirtuelle(salleVirtuelle);
		return commentaireSalleVirtuelleService.save(commentaireSalleVirtuelle);
	}

	@DeleteMapping("/commentaireSalleVirt/{id}")
	public void deleteCommSalleVirt(@PathVariable("id") Long id) {
		commentaireSalleVirtuelleService.delete(id);
	}

}
