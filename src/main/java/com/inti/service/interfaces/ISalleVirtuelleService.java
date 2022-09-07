package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.SalleVirtuelle;

public interface ISalleVirtuelleService {

	List<SalleVirtuelle> findAll();
	SalleVirtuelle findById(Long idSalleVirtuelle);
	SalleVirtuelle save(SalleVirtuelle SalleVirtuelle);
	void delete(Long idSalleVirtuelle);
}
