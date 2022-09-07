package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.SignalementSalleVirtuelle;
import com.inti.repositories.SignalementSalleVirtuelleRepository;
import com.inti.service.interfaces.ISignalementSalleVirtuelleService;

@Service
public class SignalementSalleVirtuelleService implements ISignalementSalleVirtuelleService {

	@Autowired
	SignalementSalleVirtuelleRepository signalementSalleVirtuelleRepository;

	@Override
	public List<SignalementSalleVirtuelle> findAll() {
		return signalementSalleVirtuelleRepository.findAll();
	}

	@Override
	public SignalementSalleVirtuelle findById(Long idSignalementSalleVirtuelle) {
		return signalementSalleVirtuelleRepository.findById(idSignalementSalleVirtuelle).get();
	}

	@Override
	public SignalementSalleVirtuelle save(SignalementSalleVirtuelle signalementSalleVirtuelle) {
		return signalementSalleVirtuelleRepository.save(signalementSalleVirtuelle);
	}

	@Override
	public void delete(Long idSignalementSalleVirtuelle) {
		signalementSalleVirtuelleRepository.deleteById(idSignalementSalleVirtuelle);
	}

}
