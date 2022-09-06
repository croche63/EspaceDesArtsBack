package com.inti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.EvaluationArtiste;

@Repository
public interface EvaluationArtisteDAO extends JpaRepository<EvaluationArtiste, Long> {

}
