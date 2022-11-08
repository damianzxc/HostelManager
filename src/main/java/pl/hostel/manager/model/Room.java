package pl.hostel.manager.model;

import java.util.Date;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	@Column(nullable = false)
	private String number;
	@OneToOne @JoinColumn(name = "room_id", nullable = false)
	private RoomExtension roomExtension;
	@OneToOne
	private RoomStatus roomStatus;

}
