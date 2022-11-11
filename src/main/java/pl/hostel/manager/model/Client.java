package pl.hostel.manager.model;

import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
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
	
	public Client(Long id, String name, String surname, String telephone, String address, String city, String country,
			List<Rental> rentals) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.telephone = telephone;
		this.address = address;
		this.city = city;
		this.country = country;
		this.rentals = rentals;
	}
	
	
}
