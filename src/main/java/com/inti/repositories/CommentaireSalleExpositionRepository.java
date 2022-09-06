package com.inti.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CommentaireSalleExposition;

@Repository
public interface CommentaireSalleExpositionRepository extends JpaRepository<CommentaireSalleExposition , Long>{
	

}
