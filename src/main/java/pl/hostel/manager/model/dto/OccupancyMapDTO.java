package pl.hostel.manager.model.dto;

import java.util.Map;

public class OccupancyMapDTO {

	private Map<String, Integer> occupancyLevel;

	public OccupancyMapDTO() {}

	public OccupancyMapDTO(Map<String, Integer> occupancyLevel) {
		this.occupancyLevel = occupancyLevel;
	}

	public Map<String, Integer> getOccupancyLevel() {
		return occupancyLevel;
	}

	public void setOccupancyLevel(Map<String, Integer> occupancyLevel) {
		this.occupancyLevel = occupancyLevel;
	}

}
