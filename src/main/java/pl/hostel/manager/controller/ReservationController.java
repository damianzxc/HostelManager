package pl.hostel.manager.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.hostel.manager.model.Reservation;
import pl.hostel.manager.service.ReservationService;

@RestController
@RequestMapping("/reservation")
public class ReservationController {

	private final ReservationService reservationService;

	public ReservationController(ReservationService reservationService) {
		this.reservationService = reservationService;
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Reservation>> getAllReservations() {
		List<Reservation> reservations = reservationService.getAllReservations();
		return new ResponseEntity<>(reservations, HttpStatus.OK);
	}
	
	@GetMapping("/all/active")
	public ResponseEntity<List<Reservation>> getAllActiveReservations() {
		List<Reservation> reservations = reservationService.getAllActiveReservations();
		return new ResponseEntity<>(reservations, HttpStatus.OK);
	}
	
	@GetMapping("/find/{clientName}")
	public ResponseEntity<Reservation> findReservationByClientName(@PathVariable("name") String name) {
		Reservation reservation = reservationService.findReservationByClientName(name);
		return new ResponseEntity<>(reservation, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Reservation> addReservation(@RequestBody Reservation reservation) {
		Reservation newReservation = reservationService.addReservation(reservation);
		return new ResponseEntity<>(newReservation, HttpStatus.CREATED);
	}
	
	@PutMapping("/update")
	public ResponseEntity<Reservation> updateReservation(@RequestBody Reservation client) {
		Reservation updatedReservation = reservationService.updateReservation(client);
		return new ResponseEntity<>(updatedReservation, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Reservation> DeleteReservation(@PathVariable("id") Long id) {
		reservationService.deleteReservationById(id);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
}
