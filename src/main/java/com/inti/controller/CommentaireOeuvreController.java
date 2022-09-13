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
import com.inti.entities.Oeuvre;
import com.inti.entities.Utilisateur;
import com.inti.service.impl.CommentaireOeuvreService;
import com.inti.service.impl.OeuvreService;
import com.inti.service.impl.UtilisateurService;

@RestController
@CrossOrigin
public class CommentaireOeuvreController {
	
	@Autowired
	CommentaireOeuvreService commentaireOeuvreService;
	
	@Autowired
	OeuvreService oeuvreService;
	
	@Autowired
	UtilisateurService utilisateurService;
	
	@GetMapping("/commentaireOeuvre")
	public List<CommentaireOeuvre> findAll() {
		return commentaireOeuvreService.findAll();
	}
	
	@GetMapping("commentaireOeuvre/{idU}") 
	public CommentaireOeuvre findById(@PathVariable("id")Long id) {
		return commentaireOeuvreService.findById(id); 
	}


	@PostMapping("/commentaireOeuvre/{idOeuvre}/{username}")
	public CommentaireOeuvre saveCommOeuvre(@RequestBody CommentaireOeuvre commentaireOeuvre, 
			@PathVariable("idOeuvre") String id, @PathVariable("username") String username) {
		Long idOeuvre = Long.parseLong(id);
		Oeuvre oeuvre = oeuvreService.findOne(idOeuvre);
		Utilisateur utilisateur = utilisateurService.findByUsername(username);
		commentaireOeuvre.setOeuvre(oeuvre);
		commentaireOeuvre.setUtilisateur(utilisateur);	
		return commentaireOeuvreService.save(commentaireOeuvre);
	}

	@DeleteMapping("/commentaireOeuvre/{id}")
	public void deleteCommOeuvre(@PathVariable("id") Long id) {
		commentaireOeuvreService.delete(id);
	}

}
