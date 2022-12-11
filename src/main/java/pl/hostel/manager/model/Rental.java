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
	private double grossDayFee;
	private boolean withBreakfast;
	private int breakfastCount;
	private double breakfastValue;
	private int personsCount;
	private String note;
	@OneToMany(mappedBy="rental")
	private Set<Bill> bills;
	@ManyToOne
	private Client client;
	@OneToOne
	private Reservation reservation;
	
	public Rental() {}

	public Rental(Long id, double grossDayFee, boolean withBreakfast, int breakfastCount, double breakfastValue,
			int personsCount, String note, Set<Bill> bills, Client client, Reservation reservation) {
		super();
		this.id = id;
		this.grossDayFee = grossDayFee;
		this.withBreakfast = withBreakfast;
		this.breakfastCount = breakfastCount;
		this.breakfastValue = breakfastValue;
		this.personsCount = personsCount;
		this.note = note;
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

	public double getGrossDayFee() {
		return grossDayFee;
	}

	public void setGrossDayFee(double grossDayFee) {
		this.grossDayFee = grossDayFee;
	}

	public boolean isWithBreakfast() {
		return withBreakfast;
	}

	public void setWithBreakfast(boolean withBreakfast) {
		this.withBreakfast = withBreakfast;
	}

	public int getBreakfastCount() {
		return breakfastCount;
	}

	public void setBreakfastCount(int breakfastCount) {
		this.breakfastCount = breakfastCount;
	}

	public double getBreakfastValue() {
		return breakfastValue;
	}

	public void setBreakfastValue(double breakfastValue) {
		this.breakfastValue = breakfastValue;
	}

	public int getPersonsCount() {
		return personsCount;
	}

	public void setPersonsCount(int personsCount) {
		this.personsCount = personsCount;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
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
