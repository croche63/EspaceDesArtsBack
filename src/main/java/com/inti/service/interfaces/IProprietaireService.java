package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Proprietaire;

public interface IProprietaireService {
	List<Proprietaire> findAll();

	Proprietaire findOne(Long idProprietaire);

	Proprietaire save(Proprietaire Proprietaire);

	void delete(Long idProprietaire);

	int nbrProprietaires();
}
