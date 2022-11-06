package pl.hostel.manager.model;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	@OneToOne
	private Room room;
	private double billTotal;
	private double payedValue;
	@OneToMany(mappedBy = "bill")
	private Set<BillItem> billItems;
	private Date billStart;
	@ManyToOne
	//@JoinColumn(name = "rental_id", nullable = false)
	private Rental rental;
}
