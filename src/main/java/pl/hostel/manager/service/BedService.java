package pl.hostel.manager.service;

import org.springframework.stereotype.Service;

import pl.hostel.manager.exception.NotFoundException;
import pl.hostel.manager.model.dto.OccupancyMapDTO;
import pl.hostel.manager.repository.dao.BedDAO;

@Service
public class BedService {

	private final BedDAO bedDAO;
	
	public BedService(BedDAO bedDAO) {
		this.bedDAO = bedDAO;
	}

	public OccupancyMapDTO getOccupancy() {
		return bedDAO.getOccupancy()
				.orElseThrow(() -> new NotFoundException("Occupancy cannot be found in database"));
	}
}
