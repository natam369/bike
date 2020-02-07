package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dealers {

	@Id
	private int dealerId;
	
	private String dealerName;
	
	private String dealerAddress;
	
	@ManyToOne
	private Brands brands;

	public Dealers() {
		super();
	}

	public Dealers(int dealerId, String dealerName, String dealerAddress, Brands brands) {
		super();
		this.dealerId = dealerId;
		this.dealerName = dealerName;
		this.dealerAddress = dealerAddress;
		this.brands = brands;
	}

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerAddress() {
		return dealerAddress;
	}

	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}

	public Brands getBrands() {
		return brands;
	}

	public void setBrands(Brands brands) {
		this.brands = brands;
	}

	@Override
	public String toString() {
		return "Dealers [dealerId=" + dealerId + ", dealerName=" + dealerName + ", dealerAddress=" + dealerAddress
				+ ", brands=" + brands + "]";
	}

	
	
}
