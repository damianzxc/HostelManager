package pl.hostel.manager.repository.dao;

import java.util.Optional;

import pl.hostel.manager.model.dto.RoomOccupancyDTO;

public interface RoomDAO {

	Optional<RoomOccupancyDTO> getOccupancy();
}
