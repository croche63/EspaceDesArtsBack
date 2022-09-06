package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CommentaireOeuvre;

@Repository
public interface CommentaireOeuvreRepository extends JpaRepository<CommentaireOeuvre, Long>{
	
	//commentaires de chaque oeuvre
	List<CommentaireOeuvre> findByOeuvre(String nom);

}
