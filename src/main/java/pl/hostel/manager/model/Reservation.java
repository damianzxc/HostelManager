package pl.hostel.manager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Rezerwacja jest rezerwacją dokonowaną telefonicznie
// pola agreedValuePerDay oraz agreedPeoplsCount są wartościami ustalonymi
// z klientem telefonicznie

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
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
	private boolean reservationConfirmed;
	private boolean reservationCancelled;
	private String note;
	private String clientName;
	private String clientSurname;
	private String clientTelephone;
}
