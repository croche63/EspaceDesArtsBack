package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Oeuvre;

public interface IOeuvreService {
	List<Oeuvre> findAll();

	Oeuvre findOne(Long idOeuvre);

	Oeuvre save(Oeuvre oeuvre);

	void delete(Long idOeuvre);

	int nbrOeuvre();

	Oeuvre findByNom(String nom);

}
