package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.SignalementSalleVirtuelle;

@Repository
public interface SignalementSalleVirtuelleRepository extends JpaRepository<SignalementSalleVirtuelle, Long>{

}
