package com.inti.service.interfaces;

import java.util.List;
import com.inti.entities.Reservation;


public interface IReservationService {
	List<Reservation> findAll();

	Reservation findOne(Long idReservation);

	Reservation save(Reservation reservation, String username);

	void delete(Long idReservation);

	int nbrReservation();

}
