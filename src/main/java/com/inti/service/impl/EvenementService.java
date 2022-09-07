package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Evenement;
import com.inti.repositories.EvenementRepository;
import com.inti.service.interfaces.IEvenementService;

@Service
public class EvenementService implements IEvenementService {
	@Autowired
	EvenementRepository evenementRepository;

	@Override
	public List<Evenement> findAll() {
		// TODO Auto-generated method stub
		return evenementRepository.findAll();
	}

	@Override
	public Evenement findOne(Long idEvenement) {
		// TODO Auto-generated method stub
		return evenementRepository.findById(idEvenement).get();
	}

	@Override
	public Evenement save(Evenement evenement) {
		// TODO Auto-generated method stub
		return evenementRepository.save(evenement);
	}

	@Override
	public void delete(Long idEvenement) {
		// TODO Auto-generated method stub
		evenementRepository.deleteById(idEvenement);
	}

	@Override
	public int nbrEvenement() {
		// TODO Auto-generated method stub
		return evenementRepository.nbrEvenement();
	}

}
