package pl.hostel.manager.repository.dao;

import java.util.Optional;

import pl.hostel.manager.model.dto.OccupancyMapDTO;

public interface BedDAO {
	Optional<OccupancyMapDTO> getOccupancy();
}
