package pl.hostel.manager.model;

import java.util.Set;

import javax.persistence.*;

@Entity
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
	@OneToMany(mappedBy = "roomExtension")
	private Set<Photo> photos;
	private String telelphoneNumber;
	private double pricePerDay;
	private double surchargePerPerson;
	private int maxPersonsCount;
	
	public RoomExtension() {}

	public RoomExtension(Long id, boolean hasBathroom, boolean hasBathtub, boolean hasAirConditioning,
			boolean hasBalcony, int numberOfBeds, String descriptionShort, String descriptionLong, Set<Photo> photos,
			String telelphoneNumber, double pricePerDay, double surchargePerPerson, int maxPersonsCount) {
		this.id = id;
		this.hasBathroom = hasBathroom;
		this.hasBathtub = hasBathtub;
		this.hasAirConditioning = hasAirConditioning;
		this.hasBalcony = hasBalcony;
		this.numberOfBeds = numberOfBeds;
		this.descriptionShort = descriptionShort;
		DescriptionLong = descriptionLong;
		this.photos = photos;
		this.telelphoneNumber = telelphoneNumber;
		this.pricePerDay = pricePerDay;
		this.surchargePerPerson = surchargePerPerson;
		this.maxPersonsCount = maxPersonsCount;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isHasBathroom() {
		return hasBathroom;
	}

	public void setHasBathroom(boolean hasBathroom) {
		this.hasBathroom = hasBathroom;
	}

	public boolean isHasBathtub() {
		return hasBathtub;
	}

	public void setHasBathtub(boolean hasBathtub) {
		this.hasBathtub = hasBathtub;
	}

	public boolean isHasAirConditioning() {
		return hasAirConditioning;
	}

	public void setHasAirConditioning(boolean hasAirConditioning) {
		this.hasAirConditioning = hasAirConditioning;
	}

	public boolean isHasBalcony() {
		return hasBalcony;
	}

	public void setHasBalcony(boolean hasBalcony) {
		this.hasBalcony = hasBalcony;
	}

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public String getDescriptionShort() {
		return descriptionShort;
	}

	public void setDescriptionShort(String descriptionShort) {
		this.descriptionShort = descriptionShort;
	}

	public String getDescriptionLong() {
		return DescriptionLong;
	}

	public void setDescriptionLong(String descriptionLong) {
		DescriptionLong = descriptionLong;
	}

	public Set<Photo> getPhotos() {
		return photos;
	}

	public void setPhotos(Set<Photo> photos) {
		this.photos = photos;
	}

	public String getTelelphoneNumber() {
		return telelphoneNumber;
	}

	public void setTelelphoneNumber(String telelphoneNumber) {
		this.telelphoneNumber = telelphoneNumber;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public double getSurchargePerPerson() {
		return surchargePerPerson;
	}

	public void setSurchargePerPerson(double surchargePerPerson) {
		this.surchargePerPerson = surchargePerPerson;
	}

	public int getMaxPersonsCount() {
		return maxPersonsCount;
	}

	public void setMaxPersonsCount(int maxPersonsCount) {
		this.maxPersonsCount = maxPersonsCount;
	}

}
