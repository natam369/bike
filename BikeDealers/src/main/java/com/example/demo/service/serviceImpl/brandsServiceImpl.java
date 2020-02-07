package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Brands;
import com.example.demo.repository.brandsRepository;
import com.example.demo.service.brandsService;
@Service
public class brandsServiceImpl implements brandsService{
	
	@Autowired
	private brandsRepository brandsRepo;

	@Override
	public List<Brands> getAllBrandsFromDataBase() {
		return	brandsRepo.findAll();
		 
	}

	@Override
	public List<Brands> getBranchesWithInvestment(String branchName) {
		
		return null;
	}

}
