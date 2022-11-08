package pl.hostel.manager.model.dto;

public class RoomOccupancyDto {

	private int vacant;
	private int occupied;
	
	public int getVacant() {
		return vacant;
	}
	public void setVacant(int vacant) {
		this.vacant = vacant;
	}
	public int getOccupied() {
		return occupied;
	}
	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}
}
