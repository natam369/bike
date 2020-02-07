package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Brands {

	@Id
	private int brandId;
	
	private String brandName;
	
	private double totalInvestment=0;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "brands")
	private List<Dealers> dealers;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "brands")
	private List<Bikes> bikes;

	public Brands() {
		super();
	}

	public Brands(int brandId, String brandName, double totalInvestment, List<Dealers> dealers, List<Bikes> bikes) {
		super();
		this.brandId = brandId;
		this.brandName = brandName;
		this.totalInvestment = totalInvestment;
		this.dealers = dealers;
		this.bikes = bikes;
	}

	public int getBrandId() {
		return brandId;
	}

	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getTotalInvestment() {
		return totalInvestment;
	}

	public void setTotalInvestment(double totalInvestment) {
		this.totalInvestment = totalInvestment;
	}

	public List<Dealers> getDealers() {
		return dealers;
	}

	public void setDealers(List<Dealers> dealers) {
		this.dealers = dealers;
	}

	public List<Bikes> getBikes() {
		return bikes;
	}

	public void setBikes(List<Bikes> bikes) {
		this.bikes = bikes;
	}

	
	
	
}
