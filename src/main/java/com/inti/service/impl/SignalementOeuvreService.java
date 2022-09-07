package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.SignalementOeuvre;
import com.inti.repositories.SignalementOeuvreRepository;
import com.inti.service.interfaces.ISignalementOeuvreService;

@Service
public class SignalementOeuvreService implements ISignalementOeuvreService {

	@Autowired
	SignalementOeuvreRepository signalementOeuvreRepository;

	@Override
	public List<SignalementOeuvre> findAll() {
		return signalementOeuvreRepository.findAll();
	}

	@Override
	public SignalementOeuvre findById(Long idSignalementOeuvre) {
		return signalementOeuvreRepository.findById(idSignalementOeuvre).get();
	}

	@Override
	public SignalementOeuvre save(SignalementOeuvre signalementOeuvre) {
		return signalementOeuvreRepository.save(signalementOeuvre);
	}

	@Override
	public void delete(Long idSignalementOeuvre) {
		signalementOeuvreRepository.deleteById(idSignalementOeuvre);

	}

}
