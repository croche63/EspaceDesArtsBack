package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.EvaluationArtiste;

@Repository
public interface EvaluationArtisteRepository extends JpaRepository<EvaluationArtiste, Long> {
	@Query(value = "SELECT count(*) FROM EvaluationArtiste", nativeQuery = true)
	int nbrEvaluationArtistes();
}
