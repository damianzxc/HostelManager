package pl.hostel.manager.model;

import javax.persistence.*;

@Entity
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	@Column(nullable = false)
	private String number;
	@OneToOne
	private RoomExtension roomExtension;
	@OneToOne
	private RoomStatus roomStatus;
	
	public Room() {}

	public Room(Long id, String number, RoomExtension roomExtension, RoomStatus roomStatus) {
		this.id = id;
		this.number = number;
		this.roomExtension = roomExtension;
		this.roomStatus = roomStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public RoomExtension getRoomExtension() {
		return roomExtension;
	}

	public void setRoomExtension(RoomExtension roomExtension) {
		this.roomExtension = roomExtension;
	}

	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}

}
