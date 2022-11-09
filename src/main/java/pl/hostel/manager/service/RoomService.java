package pl.hostel.manager.service;

import java.util.List;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.hostel.manager.model.dto.RoomOccupancyDto;
import pl.hostel.manager.repository.jdbc.RoomRepositoryJDBC;

@Service
@Transactional
public class RoomService {

	private final RoomRepositoryJDBC roomRepository;
	
	@Autowired
	public RoomService(RoomRepositoryJDBC roomRepository) {
		this.roomRepository = roomRepository;
	}

	public RoomOccupancyDto getRoomOccupancy() {
		RoomOccupancyDto roomOccupancyDto = roomRepository.getOccupancyDto();
		return roomOccupancyDto;
	}
}
