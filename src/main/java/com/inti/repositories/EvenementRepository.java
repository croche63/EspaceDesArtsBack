package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inti.entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long>{
	Evenement findByUsername(String username);
	
	@Query(value = "SELECT count(*) FROM Evenement", nativeQuery = true)
	int nbrEvenement();

}
