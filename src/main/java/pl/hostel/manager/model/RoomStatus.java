package pl.hostel.manager.model;

import javax.persistence.*;

@Entity
public class RoomStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	@Column(nullable = false)
	private String status;
	
	public RoomStatus() {}

	public RoomStatus(Long id, String status) {
		this.id = id;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
