package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bikes;
import com.example.demo.entity.Brands;
import com.example.demo.entity.Dealers;

public interface bikesService {

	

	String assignBrandToDealer(int brandId, int dealerId);

	String addBikesToBrand(int brandId, double totalInvestment, Bikes bike);

	List<Bikes> getAllBikesFromDatabase();

	List<Bikes> getBikesOfAParticularDealers(String dealerName);

}
