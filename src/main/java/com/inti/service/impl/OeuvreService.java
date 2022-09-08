package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Oeuvre;
import com.inti.repositories.OeuvreRepository;
import com.inti.service.interfaces.IOeuvreService;

@Service
public class OeuvreService implements IOeuvreService {
	@Autowired
	OeuvreRepository oeuvreRepository;

	@Override
	public List<Oeuvre> findAll() {
		// TODO Auto-generated method stub
		return oeuvreRepository.findAll();
	}

	@Override
	public Oeuvre findOne(Long idOeuvre) {
		// TODO Auto-generated method stub
		return oeuvreRepository.findById(idOeuvre).get();
	}

	@Override
	public Oeuvre save(Oeuvre oeuvre) {
		// TODO Auto-generated method stub
		return oeuvreRepository.save(oeuvre);
	}

	@Override
	public void delete(Long idOeuvre) {
		// TODO Auto-generated method stub
		oeuvreRepository.deleteById(idOeuvre);
	}

	@Override
	public int nbrOeuvre() {
		// TODO Auto-generated method stub
		return oeuvreRepository.nbrOeuvre();
	}

	@Override
	public Oeuvre findByNom(String nom) {
		// TODO Auto-generated method stub
		return oeuvreRepository.findByNom(nom);
	}

}
