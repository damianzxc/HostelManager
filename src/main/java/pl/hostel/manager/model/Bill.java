package pl.hostel.manager.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private double billTotal;
	private double payedValue;
	@OneToMany(mappedBy = "bill")
	private Set<BillItem> billItems;
	private Date billStart;
	@ManyToOne
	//@JoinColumn(name = "rental_id", nullable = false)
	private Rental rental;
	
	public Bill () {}

	public Bill(Long id, double billTotal, double payedValue, Set<BillItem> billItems, Date billStart,
			Rental rental) {
		this.id = id;
		this.billTotal = billTotal;
		this.payedValue = payedValue;
		this.billItems = billItems;
		this.billStart = billStart;
		this.rental = rental;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getBillTotal() {
		return billTotal;
	}

	public void setBillTotal(double billTotal) {
		this.billTotal = billTotal;
	}

	public double getPayedValue() {
		return payedValue;
	}

	public void setPayedValue(double payedValue) {
		this.payedValue = payedValue;
	}

	public Set<BillItem> getBillItems() {
		return billItems;
	}

	public void setBillItems(Set<BillItem> billItems) {
		this.billItems = billItems;
	}

	public Date getBillStart() {
		return billStart;
	}

	public void setBillStart(Date billStart) {
		this.billStart = billStart;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}
	
}
