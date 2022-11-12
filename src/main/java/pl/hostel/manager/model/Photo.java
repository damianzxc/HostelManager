package pl.hostel.manager.model;

import javax.persistence.*;

@Entity
public class Photo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private String name;
	private long sizeX;
	private long sizeY;
	private String format;
	private String imageUrl;
	@ManyToOne
	private RoomExtension roomExtension;
	
	public Photo() {}

	public Photo(Long id, String name, long sizeX, long sizeY, String format, String imageUrl,
			RoomExtension roomExtension) {
		this.id = id;
		this.name = name;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.format = format;
		this.imageUrl = imageUrl;
		this.roomExtension = roomExtension;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSizeX() {
		return sizeX;
	}

	public void setSizeX(long sizeX) {
		this.sizeX = sizeX;
	}

	public long getSizeY() {
		return sizeY;
	}

	public void setSizeY(long sizeY) {
		this.sizeY = sizeY;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public RoomExtension getRoomExtension() {
		return roomExtension;
	}

	public void setRoomExtension(RoomExtension roomExtension) {
		this.roomExtension = roomExtension;
	}
	
}
