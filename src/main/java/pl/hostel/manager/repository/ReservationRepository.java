package pl.hostel.manager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.hostel.manager.model.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long>{

	void deleteReservationById(Long id);
	Reservation findReservationByClientName(String name);
}
