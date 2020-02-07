package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Bikes {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bikeId;
	
	private String bikeName;
	
	private int bikePrice;
	
	@ManyToOne
	private Brands brands;

	public Bikes() {
		super();
	}

	public Bikes(int bikeId, String bikeName, int bikePrice, Brands brands) {
		super();
		this.bikeId = bikeId;
		this.bikeName = bikeName;
		this.bikePrice = bikePrice;
		this.brands = brands;
	}

	public int getBikeId() {
		return bikeId;
	}

	public void setBikeId(int bikeId) {
		this.bikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public int getBikePrice() {
		return bikePrice;
	}

	public void setBikePrice(int bikePrice) {
		this.bikePrice = bikePrice;
	}

	public Brands getBrands() {
		return brands;
	}

	public void setBrands(Brands brands) {
		this.brands = brands;
	}

	@Override
	public String toString() {
		return "Bikes [bikeId=" + bikeId + ", bikeName=" + bikeName + ", bikePrice=" + bikePrice + "]";
	}

}
