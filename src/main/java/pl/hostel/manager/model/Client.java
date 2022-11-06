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
}
