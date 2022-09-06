package com.inti.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.SignalementOeuvre;

@Repository
public interface SignalementOeuvreRepository extends JpaRepository<SignalementOeuvre, Long>{

}
