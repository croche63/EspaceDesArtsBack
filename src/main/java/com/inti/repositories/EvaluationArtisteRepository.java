package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.EvaluationArtiste;

@Repository
public interface EvaluationArtisteRepository extends JpaRepository<EvaluationArtiste, Long> {
	EvaluationArtiste findByUsername(String username);

	@Query(value = "SELECT count(*) FROM EvaluationArtiste", nativeQuery = true)
	int nbrEvaluationArtistes();
}
