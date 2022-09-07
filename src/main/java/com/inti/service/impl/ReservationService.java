package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Reservation;
import com.inti.repositories.ReservationRepository;
import com.inti.service.interfaces.IReservationService;

public class ReservationService implements IReservationService{
	@Autowired
	ReservationRepository reservationRepository;

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return reservationRepository.findAll();
	}

	@Override
	public Reservation findOne(Long idReservation) {
		// TODO Auto-generated method stub
		return reservationRepository.findById(idReservation).get();
	}

	@Override
	public Reservation save(Reservation reservation) {
		// TODO Auto-generated method stub
		return reservationRepository.save(reservation);
	}

	@Override
	public void delete(Long idReservation) {
		// TODO Auto-generated method stub
		reservationRepository.deleteById(idReservation);
	}

	@Override
	public int nbrReservation() {
		// TODO Auto-generated method stub
		return reservationRepository.nbrReservation();
	}

}