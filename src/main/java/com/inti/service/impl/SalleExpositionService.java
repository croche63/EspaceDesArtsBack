package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.SalleExposition;
import com.inti.repositories.SalleExpositionRepository;
import com.inti.service.interfaces.ISalleExpositionService;

@Service
public class SalleExpositionService implements ISalleExpositionService {

	@Autowired
	SalleExpositionRepository SalleExpositionRepository;

	@Override
	public List<SalleExposition> findAll() {
		return SalleExpositionRepository.findAll();
	}

	@Override
	public SalleExposition findById(Long idSalleExposition) {
		return SalleExpositionRepository.findById(idSalleExposition).get();
	}

	@Override
	public SalleExposition save(SalleExposition SalleExposition) {
		return SalleExpositionRepository.save(SalleExposition);
	}

	@Override
	public void delete(Long idSalleExposition) {
		SalleExpositionRepository.deleteById(idSalleExposition);

	}
}
