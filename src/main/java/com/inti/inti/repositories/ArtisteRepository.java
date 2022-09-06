package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Artiste;

@Repository
public interface ArtisteRepository extends JpaRepository<Artiste, Long> {
	Artiste findByUsername(String username);

	List<Artiste> findByNom(String nom);

	@Query(value = "SELECT count(*) FROM Artiste", nativeQuery = true)
	int nbrArtistes();
}
