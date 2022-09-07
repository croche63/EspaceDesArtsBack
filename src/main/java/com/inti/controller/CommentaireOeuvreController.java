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

import com.inti.entities.CommentaireOeuvre;
import com.inti.service.impl.CommentaireOeuvreService;

@RestController
@CrossOrigin
public class CommentaireOeuvreController {
	
	@Autowired
	CommentaireOeuvreService commentaireOeuvreService;
	
	@GetMapping("/commentaireOeuvre")
	public List<CommentaireOeuvre> findAll() {
		return commentaireOeuvreService.findAll();
	}
	
	@GetMapping("commentaireOeuvre/{idU}") 
	public CommentaireOeuvre findById(@PathVariable("id")Long id) {
		return commentaireOeuvreService.findById(id); 
	}


	@PostMapping("/commentaireOeuvre")
	public CommentaireOeuvre saveCommOeuvre(@RequestBody CommentaireOeuvre commentaireOeuvre) {
		return commentaireOeuvreService.save(commentaireOeuvre);
	}

	@DeleteMapping("/commentaireOeuvre/{id}")
	public void deleteCommOeuvre(@PathVariable("id") Long id) {
		commentaireOeuvreService.delete(id);
	}

}
