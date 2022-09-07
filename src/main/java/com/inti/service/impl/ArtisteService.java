package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Artiste;
import com.inti.repositories.ArtisteRepository;
import com.inti.service.interfaces.IArtisteService;

@Service
public class ArtisteService implements IArtisteService {
	@Autowired
	ArtisteRepository ArtisteRepository;

	@Override
	public List<Artiste> findAll() {

		return ArtisteRepository.findAll();
	}

	@Override
	public Artiste findOne(Long idArtiste) {

		return ArtisteRepository.findById(idArtiste).get();
	}

	@Override
	public Artiste save(Artiste Artiste) {

		return ArtisteRepository.save(Artiste);
	}

	@Override
	public void delete(Long idArtiste) {
		ArtisteRepository.deleteById(idArtiste);

	}

	@Override
	public int nbrArtistes() {
		return ArtisteRepository.nbrArtistes();
	}

}
