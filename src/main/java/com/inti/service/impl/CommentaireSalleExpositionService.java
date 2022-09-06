package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CommentaireSalleExposition;
import com.inti.repositories.CommentaireSalleExpositionRepository;
import com.inti.service.interfaces.ICommentaireSalleExpositionService;

@Service
public class CommentaireSalleExpositionService implements ICommentaireSalleExpositionService{
	
	@Autowired
	CommentaireSalleExpositionRepository commentaireSalleExpositionRepository;
	

	@Override
	public List<CommentaireSalleExposition> findAll() {
		return commentaireSalleExpositionRepository.findAll();
	}

	@Override
	public CommentaireSalleExposition findById(Long idCommentaireSalleExposition) {
		return commentaireSalleExpositionRepository.findById(idCommentaireSalleExposition).get();
	}

	@Override
	public CommentaireSalleExposition save(CommentaireSalleExposition commentaireSalleExposition) {
		return commentaireSalleExpositionRepository.save(commentaireSalleExposition);
	}

	@Override
	public void delete(Long idCommentaireSalleExposition) {
		commentaireSalleExpositionRepository.deleteById(idCommentaireSalleExposition);
		
	}

}
