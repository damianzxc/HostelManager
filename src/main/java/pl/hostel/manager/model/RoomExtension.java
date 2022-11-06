package pl.hostel.manager.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.*;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
// no extends for room, is better to create foreign key
@Table(name = "room_extension")
public class RoomExtension {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private boolean hasBathroom;
	private boolean hasBathtub;
	private boolean hasAirConditioning;
	private boolean hasBalcony;
	private int numberOfBeds;
	private String descriptionShort;
	private String DescriptionLong;
	//@OneToMany(mappedBy = "room_extension")
	//private Set<Photo> photos;
	private String telelphoneNumber;
	
}
