package com.inti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class EspaceDesArtsBackApplication {

	public static void main(String[] args) {
		SpringApplication.run(EspaceDesArtsBackApplication.class, args);
	}

	// Pour pouvoir injecter l'instance de la classe BCryptPasswordEncoder dans le
	// conteneur Spring Context
	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	// Context du Spring : utilisateurSerivice, utilisateurRepository,
	// utilisateurController, passwordEncoder
	/*
	 *
	 * PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
	 * 
	 * 
	 * @Autowired PasswordEncoder passwordEncoder;
	 */

}
