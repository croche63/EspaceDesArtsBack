package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.SignalementSalleExposition;

@Repository
public interface SignalementSalleExpositionRepository extends JpaRepository<SignalementSalleExposition, Long>{

}
