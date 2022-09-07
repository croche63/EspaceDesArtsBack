package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.SalleExposition;

public interface ISalleExpositionService {
	
	List<SalleExposition> findAll();
	SalleExposition findById(Long idSalleExposition);
	SalleExposition save(SalleExposition SalleExposition);
	void delete(Long idSalleExposition);
}
