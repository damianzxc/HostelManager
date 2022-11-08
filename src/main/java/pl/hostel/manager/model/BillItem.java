package pl.hostel.manager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class BillItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	// (data sprzedaży pojedynczego itemu)
	private Date sellDate;
	private double value;
	private int taxValue;
	private double grossPayedValue;
	private double netPayedValue;
	// przedmiot rozliczony (wartość równa się kwocie zapłaty brutto)
	private boolean itemCleared;
	@ManyToOne
	private Bill bill;
}
