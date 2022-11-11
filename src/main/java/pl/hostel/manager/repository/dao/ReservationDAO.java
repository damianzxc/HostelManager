package pl.hostel.manager.repository.dao;

import java.util.List;
import java.util.Optional;

import pl.hostel.manager.model.Reservation;

public interface ReservationDAO {

	int deleteReservationById(Long id);
	Optional<Reservation> findReservationByClientName(String name);
	Reservation save(Reservation reservation);
	List<Reservation> findAll();
}
