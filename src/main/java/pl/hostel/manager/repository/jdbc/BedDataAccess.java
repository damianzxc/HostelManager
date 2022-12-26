package pl.hostel.manager.repository.jdbc;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pl.hostel.manager.model.dto.OccupancyMapDTO;
import pl.hostel.manager.repository.dao.BedDAO;

@Repository
public class BedDataAccess implements BedDAO{

	private final JdbcTemplate jdbcTemplate;
	
	public BedDataAccess(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	
	@Override
	public Optional<OccupancyMapDTO> getOccupancy() {
		String sql = "SELECT s.status, COUNT(*) as 'beds_count' "
				+ "FROM hostel_manager.bed b "
				+ "LEFT JOIN hostel_manager.status s "
				+ "ON s.id = b.status_id "
				+ "GROUP BY b.status_id";
		Map<String, Integer> occupancy = new HashMap<>();
		jdbcTemplate.query(
				sql, 
				(rs, next)-> { 
					return occupancy.put(rs.getString("status"), rs.getInt("beds_count"));
					}
				);
		return Optional.of(new OccupancyMapDTO(occupancy));
	}

}
