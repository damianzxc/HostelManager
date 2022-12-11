package pl.hostel.manager.model;

import javax.persistence.*;

@Entity
public class Bed {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private String number;
	private String note;
	@OneToOne
	private Status status;
	@ManyToOne
	private Room room;
	
	public Bed() {}
	
	public Bed(Long id, String number, Status status, String note, Room room) {
		super();
		this.id = id;
		this.number = number;
		this.status = status;
		this.note = note;
		this.room = room;
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

}
