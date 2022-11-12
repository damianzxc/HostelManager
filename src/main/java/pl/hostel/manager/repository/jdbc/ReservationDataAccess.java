package pl.hostel.manager.repository.jdbc;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pl.hostel.manager.model.Reservation;
import pl.hostel.manager.repository.dao.ReservationDAO;
import pl.hostel.manager.repository.mapper.ReservationRowMapper;

@Repository
public class ReservationDataAccess implements ReservationDAO {

	private final JdbcTemplate jdbcTemplate;
	
	public ReservationDataAccess(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
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
	public List<Reservation> getAllReservations() {
		String sql = "SELECT * FROM hostel_manager.reservation r "
				+ "LEFT JOIN hostel_manager.reservation_status rs "
				+ "ON r.status_id = rs.id";
		return jdbcTemplate.query(sql, new ReservationRowMapper());
	}

	@Override
	public List<Reservation> getAllActiveReservations() {
		String sql = "SELECT r.id "
				+ ", r.client_name "
				+ ", r.client_surname "
				+ ", r.client_telephone "
				+ ", r.agreed_value_per_day "
				+ ", r.agreed_peoples_count "
				+ ", r.date_from "
				+ ", r.date_to "
				+ ", r.room_number "
				+ ", r.status_id "
				+ ", rs.id "
				+ ", rs.status "
				+ ", rs.info "
				+ ", r.note "
				+ "FROM hostel_manager.reservation r "
				+ "LEFT JOIN hostel_manager.reservation_status rs "
				+ "ON r.status_id = rs.id "
				+ "WHERE rs.status = 'ACCEPTED' "
				+ "OR rs.status = 'CONFIRMED' "
				+ "OR rs.status = 'NOT_ANSWER'";
		return jdbcTemplate.query(sql, new ReservationRowMapper());
	}

}
