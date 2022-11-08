package pl.hostel.manager.model;

import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
@PrimaryKeyJoinColumn(name = "id")
public class Rental extends Reservation{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private double totalPay;
	private double totalTax;
	private double netPay;
	@OneToMany(mappedBy="rental")
	private Set<Bill> bills;
	@ManyToOne
	private Client client;
	@OneToOne
	private Reservation reservation;
}
