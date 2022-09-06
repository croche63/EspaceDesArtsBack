package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.SignalementSalleExposition;
import com.inti.entities.SignalementSalleVirtuelle;

public interface ISignalementSalleVirtuelleService {
	List<SignalementSalleVirtuelle> findAll();

	SignalementSalleVirtuelle findById(Long idSignalementSalleVirtuelle);

	SignalementSalleVirtuelle save(SignalementSalleVirtuelle signalementSalleVirtuelle);

	void delete(Long idSignalementSalleVirtuelle);

}
