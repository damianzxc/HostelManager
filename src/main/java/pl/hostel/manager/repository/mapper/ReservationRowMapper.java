package pl.hostel.manager.repository.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import pl.hostel.manager.model.Reservation;
import pl.hostel.manager.model.Status;

public class ReservationRowMapper implements RowMapper<Reservation>{

	@Override
	public Reservation mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new Reservation(
				rs.getLong("id"),
				rs.getDate("date_from"),
				rs.getDate("date_to"),
				rs.getString("room_number"),
				rs.getDouble("agreed_value_per_day"),
				rs.getInt("agreed_peoples_count"),
				new Status(
						rs.getLong("status_id"),
						rs.getString("status"),
						rs.getString("info")
						),
				rs.getString("note"),
				rs.getString("client_name"),
				rs.getString("client_surname"),
				rs.getString("client_telephone")
				);
	}


}
