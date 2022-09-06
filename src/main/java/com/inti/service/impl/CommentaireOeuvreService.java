package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.CommentaireOeuvre;
import com.inti.repositories.CommentaireOeuvreRepository;
import com.inti.service.interfaces.ICommentaireOeuvreService;

@Service
public class CommentaireOeuvreService implements ICommentaireOeuvreService{
	
	@Autowired
	CommentaireOeuvreRepository commentaireOeuvreRepository;

	@Override
	public List<CommentaireOeuvre> findAll() {
		return commentaireOeuvreRepository.findAll();
	}

	@Override
	public CommentaireOeuvre findById(Long idCommentaireOeuvre) {
		return commentaireOeuvreRepository.findById(idCommentaireOeuvre).get();
	}

	@Override
	public CommentaireOeuvre save(CommentaireOeuvre commentaireOeuvre) {
		return commentaireOeuvreRepository.save(commentaireOeuvre);
	}

	@Override
	public void delete(Long idCommentaireOeuvre) {
		commentaireOeuvreRepository.deleteById(idCommentaireOeuvre);
		
	}

}
