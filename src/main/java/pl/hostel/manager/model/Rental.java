package pl.hostel.manager.model;

import java.util.Set;

import javax.persistence.*;

@Entity
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
	
	public Rental() {}

	public Rental(Long id, double totalPay, double totalTax, double netPay, Set<Bill> bills, Client client,
			Reservation reservation) {
		this.id = id;
		this.totalPay = totalPay;
		this.totalTax = totalTax;
		this.netPay = netPay;
		this.bills = bills;
		this.client = client;
		this.reservation = reservation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getTotalPay() {
		return totalPay;
	}

	public void setTotalPay(double totalPay) {
		this.totalPay = totalPay;
	}

	public double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(double totalTax) {
		this.totalTax = totalTax;
	}

	public double getNetPay() {
		return netPay;
	}

	public void setNetPay(double netPay) {
		this.netPay = netPay;
	}

	public Set<Bill> getBills() {
		return bills;
	}

	public void setBills(Set<Bill> bills) {
		this.bills = bills;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

}
