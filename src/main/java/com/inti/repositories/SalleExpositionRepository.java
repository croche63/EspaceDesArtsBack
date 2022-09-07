package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.SalleExposition;

@Repository
public interface SalleExpositionRepository extends JpaRepository<SalleExposition, Long>{

}
