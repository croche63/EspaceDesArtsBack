package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.SignalementSalleExposition;

public interface ISignalementSalleExpositionService {
	List<SignalementSalleExposition> findAll();

	SignalementSalleExposition findById(Long idSignalementSalleExposition);

	SignalementSalleExposition save(SignalementSalleExposition signalementSalleExposition);

	void delete(Long idSignalementSalleExposition);

}
