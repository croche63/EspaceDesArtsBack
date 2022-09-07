package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.inti.entities.Oeuvre;
import com.inti.entities.Reservation;

public interface OeuvreRepository extends JpaRepository<Oeuvre, Long>{
	Oeuvre findByName(String name);
	
	@Query(value = "SELECT count(*) FROM Oeuvre", nativeQuery = true)
	int nbrOeuvre();

}
