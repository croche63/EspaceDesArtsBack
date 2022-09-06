package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.EvaluationArtiste;

public interface IEvaluationArtisteService {
	List<EvaluationArtiste> findAll();

	EvaluationArtiste findOne(Long idEvaluationArtiste);

	EvaluationArtiste save(EvaluationArtiste EvaluationArtiste);

	void delete(Long idEvaluationArtiste);

	int nbrEvaluationArtistes();
}
