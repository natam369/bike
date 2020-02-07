package com.example.demo.service.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Bikes;
import com.example.demo.entity.Brands;
import com.example.demo.entity.Dealers;
import com.example.demo.repository.bikesRepository;
import com.example.demo.repository.brandsRepository;
import com.example.demo.repository.dealersRepository;
import com.example.demo.service.bikesService;

@Service
public class bikesServiceImpl implements bikesService {

	@Autowired
	private bikesRepository bikesRepo;

	@Autowired
	private brandsRepository brandsRepo;

	@Autowired
	private dealersRepository dealersRepo;

	@Override
	public String assignBrandToDealer(int brandId, int dealerId) {
		Brands brand = brandsRepo.findById(brandId).get();
		System.out.println(brand);
		// String brName=brand.getBrandName();
		Dealers dealer = dealersRepo.findById(dealerId).get();
		dealer.setBrands(brand);
		dealersRepo.save(dealer);

		return "assigned successfully";
	}

	@Override
	public String addBikesToBrand(int brandId,double totalInvestment, Bikes bike) {
		Brands brand = brandsRepo.findById(brandId).get();
		totalInvestment=totalInvestment+bike.getBikePrice();
		brand.setTotalInvestment(totalInvestment);
		bike.setBrands(brand);
		bikesRepo.save(bike);

		return "added";

	}

	@Override
	public List<Bikes> getAllBikesFromDatabase() {

		return bikesRepo.findAll();
	}

	@Override
	public List<Bikes> getBikesOfAParticularDealers(String dealerName) {
		List<Bikes> bikess = new ArrayList<Bikes>();
		for (Dealers dealers : dealersRepo.findAll()) {
			Brands brands = dealers.getBrands();
			if (dealerName.equalsIgnoreCase(dealers.getDealerName())) {
				for (Bikes bikes : brands.getBikes()) {

					bikess.add(bikes);
					//return bikess;
				}

			}

		}
		return bikess;

	}
}