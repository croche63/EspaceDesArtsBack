package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CommentaireOeuvre;


public interface ICommentaireOeuvreService {
	List<CommentaireOeuvre> findAll();

	CommentaireOeuvre findById(Long idCommentaireOeuvre);

	CommentaireOeuvre save(CommentaireOeuvre commentaireOeuvre);

	void delete(Long idCommentaireOeuvre);

	

}
