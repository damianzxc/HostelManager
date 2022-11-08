package pl.hostel.manager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.hostel.manager.model.dto.RoomOccupancyDto;
import pl.hostel.manager.service.RoomService;

@RestController
@RequestMapping("/room")
public class RoomController {

	private final RoomService roomService;
	
	public RoomController(RoomService roomService) {
		this.roomService = roomService;
	}
	
	@GetMapping("/occupancy-level")
	public ResponseEntity<RoomOccupancyDto> getRoomsOccupancy() {
		RoomOccupancyDto roomOccupancy = roomService.getRoomOccupancy();
		return new ResponseEntity<>(roomOccupancy, HttpStatus.FOUND);
	}
	
//	@GetMapping("/occupancy")
//	public ResponseEntity<RoomOccupancyDto> getVacantRoomsNumber() {
//		RoomOccupancyDto roomOccupancy = roomService.getRoomsOccupancy();
//		return new ResponseEntity<>(roomOccupancy, HttpStatus.OK);
//	}
	
}
