package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Artiste;

@Repository
public interface ArtisteRepository extends JpaRepository<Artiste, Long> {
	@Query(value = "SELECT count(*) FROM Artiste", nativeQuery = true)
	int nbrArtistes();
	
	Artiste findByUsername (String username);
}
