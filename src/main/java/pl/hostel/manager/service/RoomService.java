package pl.hostel.manager.service;

import org.springframework.stereotype.Service;

import pl.hostel.manager.exception.NotFoundException;
import pl.hostel.manager.model.dto.RoomOccupancyDTO;
import pl.hostel.manager.repository.dao.RoomDAO;

@Service
public class RoomService {

	private final RoomDAO roomDAO;
	
	public RoomService(RoomDAO roomDAO) {
		this.roomDAO = roomDAO;
	}

	public RoomOccupancyDTO getRoomOccupancy() {
		return roomDAO.getOccupancy()
				.orElseThrow(() -> new NotFoundException("Occupancy cannot be found in database"));
	}
}
