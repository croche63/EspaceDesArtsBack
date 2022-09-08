package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Artiste;

public interface IArtisteService {
	List<Artiste> findAll();

	Artiste findOne(Long idArtiste);

	Artiste save(Artiste Artiste);

	void delete(Long idArtiste);

	int nbrArtistes();
	
	Artiste findByUsername(String username);
}
