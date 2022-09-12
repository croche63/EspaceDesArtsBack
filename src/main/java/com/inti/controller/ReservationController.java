package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Artiste;
import com.inti.entities.Reservation;
import com.inti.entities.SalleExposition;
import com.inti.service.interfaces.IArtisteService;
import com.inti.service.interfaces.IReservationService;
import com.inti.service.interfaces.ISalleExpositionService;

@RestController
@CrossOrigin
public class ReservationController {
	@Autowired
	IReservationService reservationService;
	
	@Autowired
	IArtisteService artisteService;
	
	@Autowired
	ISalleExpositionService salleExpositionService;
	
	@GetMapping("/Reservations")
	public List<Reservation> findAll(){
		return reservationService.findAll();
	}
	
	@PostMapping("/Reservations/{username}/{idSalle}")
	public Reservation saveReservation(@RequestBody Reservation reservation, @PathVariable("username") String username, 
			@PathVariable("idSalle") String id) {
		Artiste artiste = artisteService.findByUsername(username);
		reservation.setArtiste(artiste);
		
		Long idSalleExp = Long.parseLong(id);
		SalleExposition salleExposition = salleExpositionService.findById(idSalleExp);
		reservation.setSalleExposition(salleExposition);
		return reservationService.save(reservation, username);
	}
	
	@DeleteMapping("/Reservations/{id}")
	public void deleteEvenement(@PathVariable("id") Long id) {
		reservationService.delete(id);
	}

}
