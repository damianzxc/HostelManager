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
	private double netBillTotal;
	private double grossBillTotal;
	private double grossPayedValue;
	private Date billStart;
	private Date billEnd;
	private boolean billCleared;
	@ManyToOne
	private Rental rental;
	@OneToMany(mappedBy = "bill")
	private Set<BillItem> billItems;
	
	public Bill () {}

	public Bill(Long id, double netBillTotal, double grossBillTotal, double grossPayedValue, Date billStart,
			Date billEnd, boolean billCleared, Rental rental, Set<BillItem> billItems) {
		super();
		this.id = id;
		this.netBillTotal = netBillTotal;
		this.grossBillTotal = grossBillTotal;
		this.grossPayedValue = grossPayedValue;
		this.billStart = billStart;
		this.billEnd = billEnd;
		this.billCleared = billCleared;
		this.rental = rental;
		this.billItems = billItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getNetBillTotal() {
		return netBillTotal;
	}

	public void setNetBillTotal(double netBillTotal) {
		this.netBillTotal = netBillTotal;
	}

	public double getGrossBillTotal() {
		return grossBillTotal;
	}

	public void setGrossBillTotal(double grossBillTotal) {
		this.grossBillTotal = grossBillTotal;
	}

	public double getGrossPayedValue() {
		return grossPayedValue;
	}

	public void setGrossPayedValue(double grossPayedValue) {
		this.grossPayedValue = grossPayedValue;
	}

	public Date getBillStart() {
		return billStart;
	}

	public void setBillStart(Date billStart) {
		this.billStart = billStart;
	}

	public Date getBillEnd() {
		return billEnd;
	}

	public void setBillEnd(Date billEnd) {
		this.billEnd = billEnd;
	}

	public boolean isBillCleared() {
		return billCleared;
	}

	public void setBillCleared(boolean billCleared) {
		this.billCleared = billCleared;
	}

	public Rental getRental() {
		return rental;
	}

	public void setRental(Rental rental) {
		this.rental = rental;
	}

	public Set<BillItem> getBillItems() {
		return billItems;
	}

	public void setBillItems(Set<BillItem> billItems) {
		this.billItems = billItems;
	}

}
