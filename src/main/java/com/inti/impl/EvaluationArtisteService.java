package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.EvaluationArtiste;
import com.inti.repositories.EvaluationArtisteRepository;
import com.inti.service.interfaces.IEvaluationArtisteService;

@Service
public class EvaluationArtisteService implements IEvaluationArtisteService {
	@Autowired
	EvaluationArtisteRepository EvaluationArtisteRepository;

	@Override
	public List<EvaluationArtiste> findAll() {

		return EvaluationArtisteRepository.findAll();
	}

	@Override
	public EvaluationArtiste findOne(Long idEvaluationArtiste) {

		return EvaluationArtisteRepository.findById(idEvaluationArtiste).get();
	}

	@Override
	public EvaluationArtiste save(EvaluationArtiste EvaluationArtiste) {

		return EvaluationArtisteRepository.save(EvaluationArtiste);
	}

	@Override
	public void delete(Long idEvaluationArtiste) {
		EvaluationArtisteRepository.deleteById(idEvaluationArtiste);

	}

	@Override
	public int nbrEvaluationArtistes() {
		return EvaluationArtisteRepository.nbrEvaluationArtistes();
	}

}
