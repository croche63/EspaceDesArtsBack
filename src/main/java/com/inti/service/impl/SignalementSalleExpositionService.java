package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.SignalementSalleExposition;
import com.inti.repositories.SignalementSalleExpositionRepository;
import com.inti.service.interfaces.ISignalementSalleExpositionService;

@Service
public class SignalementSalleExpositionService implements ISignalementSalleExpositionService{
	
	@Autowired
	SignalementSalleExpositionRepository signalementSalleExpositionRepository;

	@Override
	public List<SignalementSalleExposition> findAll() {
		return signalementSalleExpositionRepository.findAll();
	}

	@Override
	public SignalementSalleExposition findById(Long idSignalementSalleExposition) {
		return signalementSalleExpositionRepository.findById(idSignalementSalleExposition).get();
	}

	@Override
	public SignalementSalleExposition save(SignalementSalleExposition signalementSalleExposition) {
		return signalementSalleExpositionRepository.save(signalementSalleExposition);
	}

	@Override
	public void delete(Long idSignalementSalleExposition) {
		signalementSalleExpositionRepository.deleteById(idSignalementSalleExposition);
		
	}

}
