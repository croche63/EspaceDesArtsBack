package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CommentaireSalleVirtuelle;
import com.inti.repositories.CommentaireSalleVirtuelleRepository;
import com.inti.service.interfaces.ICommentaireSalleVirtuelleService;

@Service
public class CommentaireSalleVirtuelleService implements ICommentaireSalleVirtuelleService{
	
	@Autowired
	CommentaireSalleVirtuelleRepository commentaireSalleVirtuelleRepository;

	@Override
	public List<CommentaireSalleVirtuelle> findAll() {
		return commentaireSalleVirtuelleRepository.findAll();
	}

	@Override
	public CommentaireSalleVirtuelle findById(Long idCommentaireSalleVirtuelle) {
		return commentaireSalleVirtuelleRepository.findById(idCommentaireSalleVirtuelle).get();
	}

	@Override
	public CommentaireSalleVirtuelle save(CommentaireSalleVirtuelle commentaireSalleVirtuelle) {
		return commentaireSalleVirtuelleRepository.save(commentaireSalleVirtuelle);
	}

	@Override
	public void delete(Long idCommentaireSalleVirtuelle) {
		commentaireSalleVirtuelleRepository.deleteById(idCommentaireSalleVirtuelle);
		
	}
	
	
}
