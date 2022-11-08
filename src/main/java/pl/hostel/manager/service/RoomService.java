package pl.hostel.manager.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.hostel.manager.model.dto.RoomOccupancyDto;
import pl.hostel.manager.repository.RoomRepository;

@Service
@Transactional
public class RoomService {

	private final RoomRepository roomRepository;
	
	@Autowired
	public RoomService(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}
	
	public int getVacantRoomsNumber() {
		return roomRepository.getVacantRoomsNumber();
	}
	
	public int getOccupiedRoomsNumber() {
		return roomRepository.getOccupiedRoomsNumber();
	}

	public RoomOccupancyDto getRoomOccupancy() {
		RoomOccupancyDto roomOccupancy = new RoomOccupancyDto();
		roomOccupancy.setVacant(roomRepository.getOccupiedRoomsNumber());
		return roomOccupancy;
	}
}
