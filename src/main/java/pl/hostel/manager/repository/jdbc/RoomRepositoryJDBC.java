package pl.hostel.manager.repository.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import pl.hostel.manager.model.dto.RoomOccupancyDto;

@Repository
public class RoomRepositoryJDBC {
	
	private DataSource dataSource;
	
	public RoomRepositoryJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	public RoomOccupancyDto getOccupancyDto() {
		String query = "SELECT rs.status, COUNT(*) as 'rooms_count' "
				+ "FROM hostel_manager.room r "
				+ "LEFT JOIN hostel_manager.room_status rs "
				+ "ON rs.id = r.room_status_id "
				+ "GROUP BY r.room_status_id";
		Connection connection = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		RoomOccupancyDto roomOccupancyDto = new RoomOccupancyDto();
		Map<String, Integer> occupancy = new HashMap<String, Integer>();
		try {
			connection = dataSource.getConnection();
			ps = connection.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				occupancy.put(rs.getString("status"), rs.getInt("rooms_count"));
			}
			roomOccupancyDto.setRoomOccupancy(occupancy);
		} catch (SQLException e){
			e.printStackTrace();
		}
		return roomOccupancyDto;
	};
	
}
