package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Proprietaire;
import com.inti.repositories.ProprietaireRepository;
import com.inti.service.interfaces.IProprietaireService;

@Service
public class ProprietaireService implements IProprietaireService {
	@Autowired
	ProprietaireRepository ProprietaireRepository;

	@Override
	public List<Proprietaire> findAll() {

		return ProprietaireRepository.findAll();
	}

	@Override
	public Proprietaire findOne(Long idProprietaire) {

		return ProprietaireRepository.findById(idProprietaire).get();
	}

	@Override
	public Proprietaire save(Proprietaire Proprietaire) {

		return ProprietaireRepository.save(Proprietaire);
	}

	@Override
	public void delete(Long idProprietaire) {
		ProprietaireRepository.deleteById(idProprietaire);

	}

	@Override
	public int nbrProprietaires() {
		return ProprietaireRepository.nbrProprietaires();
	}

}
