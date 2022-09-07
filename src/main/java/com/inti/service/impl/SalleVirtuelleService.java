package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.SalleVirtuelle;
import com.inti.repositories.SalleVirtuelleRepository;
import com.inti.service.interfaces.ISalleVirtuelleService;

public class SalleVirtuelleService implements ISalleVirtuelleService{
	
	@Autowired
	SalleVirtuelleRepository SalleVirtuelleRepository;
	

	@Override
	public List<SalleVirtuelle> findAll() {
		return SalleVirtuelleRepository.findAll();
	}

	@Override
	public SalleVirtuelle findById(Long idSalleVirtuelle) {
		return SalleVirtuelleRepository.findById(idSalleVirtuelle).get();
	}

	@Override
	public SalleVirtuelle save(SalleVirtuelle SalleVirtuelle) {
		return SalleVirtuelleRepository.save(SalleVirtuelle);
	}

	@Override
	public void delete(Long idSalleVirtuelle) {
		SalleVirtuelleRepository.deleteById(idSalleVirtuelle);
		
	}

}
