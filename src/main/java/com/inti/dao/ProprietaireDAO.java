package com.inti.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Proprietaire;

@Repository
public interface ProprietaireDAO extends JpaRepository<Proprietaire, Long> {

}
