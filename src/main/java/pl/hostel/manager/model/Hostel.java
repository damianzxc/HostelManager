package pl.hostel.manager.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hostel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private String name;
	private String address;
	private String city;
	private String telephone;
	private String wwwUrl;
	private String description;
	
	public Hostel() {}

	public Hostel(Long id, String name, String address, String city, String telephone, String wwwUrl,
			String description) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.city = city;
		this.telephone = telephone;
		this.wwwUrl = wwwUrl;
		this.description = description;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getWwwUrl() {
		return wwwUrl;
	}

	public void setWwwUrl(String wwwUrl) {
		this.wwwUrl = wwwUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
