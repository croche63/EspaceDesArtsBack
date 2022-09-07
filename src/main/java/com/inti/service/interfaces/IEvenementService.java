package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Evenement;

public interface IEvenementService {
	List<Evenement> findAll();

	Evenement findOne(Long idEvenement);

	Evenement save(Evenement evenement);

	void delete(Long idEvenement);

	int nbrEvenement();

}
