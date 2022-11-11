package pl.hostel.manager.repository.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import pl.hostel.manager.model.Reservation;
import pl.hostel.manager.repository.dao.ReservationDAO;

@Repository
public class ReservationDataAccess implements ReservationDAO {

	@Override
	public int deleteReservationById(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Optional<Reservation> findReservationByClientName(String name) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Reservation save(Reservation reservation) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Reservation> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
