package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CommentaireSalleExposition;

public interface ICommentaireSalleExpositionService {
	List<CommentaireSalleExposition> findAll();

	CommentaireSalleExposition findById(Long idCommentaireSalleExposition);

	CommentaireSalleExposition save(CommentaireSalleExposition commentaireSalleExposition);

	void delete(Long idCommentaireSalleExposition);

}
