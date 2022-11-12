package pl.hostel.manager.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.hostel.manager.exception.NotFoundException;
import pl.hostel.manager.model.Reservation;
import pl.hostel.manager.repository.dao.ReservationDAO;

@Service
public class ReservationService {

	private final ReservationDAO reservationDAO;

	public ReservationService(ReservationDAO reservationDAO) {
		this.reservationDAO = reservationDAO;
	}
	
	public Reservation addReservation(Reservation reservation) {
		return reservationDAO.saveReservation(reservation);
	}
	
	public List<Reservation> getAllReservations() {
		return reservationDAO.getAllReservations();
	}
	
	public List<Reservation> getAllActiveReservations() {
		return reservationDAO.getAllActiveReservations();
	};
	
	public Reservation updateReservation(Reservation reservation) {
		return null;
	}
	
	public Reservation findReservationByClientName(String clientName) {
		return reservationDAO.findReservationByClientName(clientName)
				.orElseThrow(() -> new NotFoundException("Reservation by client name "+ clientName +" was not found."));
	}
	
	public void deleteReservationById(Long id) {
		reservationDAO.deleteReservationById(id);
	}
	
}
