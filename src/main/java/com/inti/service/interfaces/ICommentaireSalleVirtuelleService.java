package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.CommentaireSalleExposition;
import com.inti.entities.CommentaireSalleVirtuelle;

public interface ICommentaireSalleVirtuelleService {
	List<CommentaireSalleVirtuelle> findAll();

	CommentaireSalleVirtuelle findById(Long idCommentaireSalleVirtuelle);

	CommentaireSalleVirtuelle save(CommentaireSalleVirtuelle commentaireSalleVirtuelle);

	void delete(Long idCommentaireSalleVirtuelle);

}
