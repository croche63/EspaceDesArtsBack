package com.inti.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Role;
import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@RestController
@CrossOrigin
public class UtilisateurController {
	@Autowired
	IUtilisateurService utilisateurService;

	@Autowired
	PasswordEncoder passwordEncoder;

	@GetMapping("/utilisateurs")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping("/utilisateurs/{idUtilisateur}")
	public Utilisateur findOne(@PathVariable("idUtilisateur") Long id) {
		return utilisateurService.findOne(id);
	}

	@PostMapping("/utilisateurs")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) {
		utilisateur.setPassword(passwordEncoder.encode(utilisateur.getPassword()));
		return utilisateurService.save(utilisateur);

	}
	// Nouvelle méthode de sauvegarde:
	/*
	 * @PostMapping("/utilisateurs") public String
	 * saveUtilisateur(@RequestParam("nom") String nom, @RequestParam("prenom")
	 * String prenom,
	 * 
	 * @RequestParam("username") String username, @RequestParam("password") String
	 * password,
	 * 
	 * @RequestParam("email") String email,
	 * 
	 * @RequestParam("numeroTel") String numeroTel,
	 * 
	 * @RequestParam("roles") Set<Role> roles,
	 * 
	 * @RequestParam(name="image", required = false) MultipartFile image) { try {
	 * Utilisateur currentUser = new Utilisateur(); currentUser.setNom(nom);
	 * currentUser.setPrenom(prenom); currentUser.setUsername(username);
	 * currentUser.setPassword(passwordEncoder.encode(password));
	 * currentUser.setEmail(email); currentUser.setNumeroTel(numeroTel);
	 * currentUser.setRoles(roles); //Sauvegarder image que si on en a envoyé une
	 * if(image != null) { currentUser.setImage(image.getBytes()); }
	 * utilisateurService.save(currentUser);
	 * 
	 * return "User created successfully! "; } catch (Exception ex) {
	 * ex.printStackTrace(); return
	 * "Fail! maybe you had uploaded the file before or the file's size > 500KB"; //
	 * TODO: handle exception } }
	 */

	@DeleteMapping("/utilisateurs/{idUtilisateur}")
	public void deleteUtilisateur(@PathVariable("idUtilisateur") Long id) {
		utilisateurService.delete(id);
	}

	@PutMapping("users/{idUtilisateur}")
	public Utilisateur updateUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur,
			@RequestBody Utilisateur user) {
		Utilisateur currentUtilisateur = utilisateurService.findOne(idUtilisateur);
		currentUtilisateur.setNom(user.getNom());
		currentUtilisateur.setPrenom(user.getPrenom());
		currentUtilisateur.setUsername(user.getUsername());
		currentUtilisateur.setPassword(user.getPassword());
		currentUtilisateur.setRoles(user.getRoles());
		return utilisateurService.save(currentUtilisateur);
	}

}
