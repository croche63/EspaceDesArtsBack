package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Proprietaire;

@Repository
public interface ProprietaireRepository extends JpaRepository<Proprietaire, Long> {
	Proprietaire findByUsername(String username);

	List<Proprietaire> findByNom(String nom);

	@Query(value = "SELECT count(*) FROM Proprietaire", nativeQuery = true)
	int nbrProprietaires();
}
