package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.CommentaireSalleVirtuelle;

@Repository
public interface CommentaireSalleVirtuelleRepository extends JpaRepository<CommentaireSalleVirtuelle, Long>{

}
