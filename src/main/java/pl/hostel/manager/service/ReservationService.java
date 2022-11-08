package pl.hostel.manager.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.hostel.manager.exception.ClientNotFoundException;
import pl.hostel.manager.model.Client;
import pl.hostel.manager.model.Reservation;
import pl.hostel.manager.repository.ReservationRepository;

@Service
@Transactional
public class ReservationService {

	private final ReservationRepository reservationRepository;

	@Autowired
	public ReservationService(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
	
	public Reservation addReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}
	
	public List<Reservation> findAll() {
		return reservationRepository.findAll();
	}
	
	public Reservation updateReservation(Reservation reservation) {
		return reservationRepository.save(reservation);
	}
	
	public Reservation findReservationByClientName(String clientName) {
		return reservationRepository.findReservationByClientName(clientName);
	}
	
	public void deleteReservationById(Long id) {
		reservationRepository.deleteReservationById(id);
	}
	
}
