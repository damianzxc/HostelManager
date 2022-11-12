package pl.hostel.manager.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Long id;
	@Column(nullable = false)
	private String name;
	private String surname;
	@Column(nullable = false)
	private String telephone;
	private String address;
	private String city;
	private String country;
	@OneToMany(mappedBy = "client")
	private List<Rental> rentals;
	
	public Client() {}
	
	public Client(Long id, String name, String surname, String telephone, String address, String city, String country,
			List<Rental> rentals) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.telephone = telephone;
		this.address = address;
		this.city = city;
		this.country = country;
		this.rentals = rentals;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public List<Rental> getRentals() {
		return rentals;
	}

	public void setRentals(List<Rental> rentals) {
		this.rentals = rentals;
	}
	
	
}
