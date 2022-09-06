package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.SignalementOeuvre;

public interface ISignalementOeuvreService {
	List<SignalementOeuvre> findAll();

	SignalementOeuvre findById(Long idSignalementOeuvre);

	SignalementOeuvre save(SignalementOeuvre signalementOeuvre);

	void delete(Long idSignalementOeuvre);

}
