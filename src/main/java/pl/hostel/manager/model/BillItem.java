package pl.hostel.manager.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class BillItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false, updatable=false)
	private Long id;
	private Date sellDate;
	private double netValue;
	private double grossValue;
	private int taxValue;
	private double grossPayedValue;
	private double netPayedValue;
	// true when value = grossPayedValue
	private boolean itemCleared;
	@ManyToOne
	private Bill bill;
	
	public BillItem() {}

	public BillItem(Long id, Date sellDate, double netValue, double grossValue, int taxValue, double grossPayedValue,
			double netPayedValue, boolean itemCleared, Bill bill) {
		super();
		this.id = id;
		this.sellDate = sellDate;
		this.netValue = netValue;
		this.grossValue = grossValue;
		this.taxValue = taxValue;
		this.grossPayedValue = grossPayedValue;
		this.netPayedValue = netPayedValue;
		this.itemCleared = itemCleared;
		this.bill = bill;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getSellDate() {
		return sellDate;
	}

	public void setSellDate(Date sellDate) {
		this.sellDate = sellDate;
	}

	public double getNetValue() {
		return netValue;
	}

	public void setNetValue(double netValue) {
		this.netValue = netValue;
	}

	public double getGrossValue() {
		return grossValue;
	}

	public void setGrossValue(double grossValue) {
		this.grossValue = grossValue;
	}

	public int getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(int taxValue) {
		this.taxValue = taxValue;
	}

	public double getGrossPayedValue() {
		return grossPayedValue;
	}

	public void setGrossPayedValue(double grossPayedValue) {
		this.grossPayedValue = grossPayedValue;
	}

	public double getNetPayedValue() {
		return netPayedValue;
	}

	public void setNetPayedValue(double netPayedValue) {
		this.netPayedValue = netPayedValue;
	}

	public boolean isItemCleared() {
		return itemCleared;
	}

	public void setItemCleared(boolean itemCleared) {
		this.itemCleared = itemCleared;
	}

	public Bill getBill() {
		return bill;
	}

	public void setBill(Bill bill) {
		this.bill = bill;
	}
	
}
