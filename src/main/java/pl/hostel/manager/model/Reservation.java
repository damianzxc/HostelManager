package pl.hostel.manager.model;

import java.util.Date;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private Date dateFrom;
	private Date dateTo;
	// opcja zamienić na obiekt
	private String roomNumber;
	private double agreedValuePerDay;
	private int agreedPeoplesCount;
	@OneToOne
	private ReservationStatus status;
	private String note;
	private String clientName;
	private String clientSurname;
	private String clientTelephone;
	
	public Reservation() {}

	public Reservation(Long id, Date dateFrom, Date dateTo, String roomNumber, double agreedValuePerDay,
			int agreedPeoplesCount, ReservationStatus status, String note, String clientName, String clientSurname,
			String clientTelephone) {
		this.id = id;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
		this.roomNumber = roomNumber;
		this.agreedValuePerDay = agreedValuePerDay;
		this.agreedPeoplesCount = agreedPeoplesCount;
		this.status = status;
		this.note = note;
		this.clientName = clientName;
		this.clientSurname = clientSurname;
		this.clientTelephone = clientTelephone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public double getAgreedValuePerDay() {
		return agreedValuePerDay;
	}

	public void setAgreedValuePerDay(double agreedValuePerDay) {
		this.agreedValuePerDay = agreedValuePerDay;
	}

	public int getAgreedPeoplesCount() {
		return agreedPeoplesCount;
	}

	public void setAgreedPeoplesCount(int agreedPeoplesCount) {
		this.agreedPeoplesCount = agreedPeoplesCount;
	}

	public ReservationStatus getStatus() {
		return status;
	}

	public void setStatus(ReservationStatus status) {
		this.status = status;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientSurname() {
		return clientSurname;
	}

	public void setClientSurname(String clientSurname) {
		this.clientSurname = clientSurname;
	}

	public String getClientTelephone() {
		return clientTelephone;
	}

	public void setClientTelephone(String clientTelephone) {
		this.clientTelephone = clientTelephone;
	}

}
