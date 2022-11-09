package pl.hostel.manager.model.dto;

import java.util.Map;

public class RoomOccupancyDto {

	private Map<String, Integer> roomOccupancy;

	public Map<String, Integer> getRoomOccupancy() {
		return roomOccupancy;
	}

	public void setRoomOccupancy(Map<String, Integer> roomOccupancy) {
		this.roomOccupancy = roomOccupancy;
	}
}
