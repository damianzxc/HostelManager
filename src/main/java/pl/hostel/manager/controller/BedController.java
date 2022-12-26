package pl.hostel.manager.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.hostel.manager.model.dto.OccupancyMapDTO;
import pl.hostel.manager.service.BedService;

@RestController
@RequestMapping("/bed")
public class BedController {

	private final BedService bedService;
	
	public BedController(BedService bedService) {
		this.bedService = bedService;
	}
	
	@GetMapping("/occupancy-level")
	public ResponseEntity<OccupancyMapDTO> getOccupancy() {
		OccupancyMapDTO occupancy = bedService.getOccupancy();
		return new ResponseEntity<>(occupancy, HttpStatus.OK);
	}
	
}

