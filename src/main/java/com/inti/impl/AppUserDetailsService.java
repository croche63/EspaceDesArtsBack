package com.inti.service.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.inti.entities.Role;
import com.inti.entities.Utilisateur;
import com.inti.models.UtililisateurDetail;
import com.inti.service.interfaces.IUtilisateurService;

@Service
public class AppUserDetailsService implements UserDetailsService {
	@Autowired
	IUtilisateurService utilisateurService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Utilisateur utilisateur=utilisateurService.findByUsername(username);
		System.out.println(utilisateur.toString());
		System.out.println(utilisateur.getRoles());
		Set<Role> roles=utilisateur.getRoles();
		Set<GrantedAuthority> authorities=new HashSet<GrantedAuthority>();
		for (Role role : roles) {
			authorities.add(new SimpleGrantedAuthority(role.getLibelle())); // les roles dans la variable authorities : admin,user
		}
		UtililisateurDetail utililisateurDetail=new UtililisateurDetail(); 
		utililisateurDetail.setUtilisateur(utilisateur);  // l'utilisateur
		utililisateurDetail.setAuthorities(authorities); // les profils
		return utililisateurDetail;
	}

}
