package pl.hostel.manager.repository.jdbc;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pl.hostel.manager.model.dto.OccupancyMapDTO;
import pl.hostel.manager.repository.dao.RoomDAO;

@Repository
public class RoomDataAccess implements RoomDAO{

	private final JdbcTemplate jdbcTemplate;
	
	public RoomDataAccess(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Override
	public Optional<OccupancyMapDTO> getOccupancy() {
		String sql = "SELECT s.status, COUNT(*) as 'rooms_count' "
				+ "FROM hostel_manager.room r "
				+ "LEFT JOIN hostel_manager.status s "
				+ "ON s.id = r.status_id "
				+ "GROUP BY r.status_id";
		Map<String, Integer> occupancy = new HashMap<>();
		jdbcTemplate.query(
				sql,
				(rs, next)-> { 
					return occupancy.put(rs.getString("status"), rs.getInt("rooms_count"));
					}
				);
		return Optional.of(new OccupancyMapDTO(occupancy));
	}

}
