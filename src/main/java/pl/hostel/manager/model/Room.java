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
	private Status status;
	@OneToOne
	private RoomType roomType;
	
	public Room() {}

	public Room(Long id, String number, RoomExtension roomExtension, Status status, RoomType roomType) {
		this.id = id;
		this.number = number;
		this.roomExtension = roomExtension;
		this.status = status;
		this.roomType = roomType;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public RoomType getRoomType() {
		return roomType;
	}

	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}

}
