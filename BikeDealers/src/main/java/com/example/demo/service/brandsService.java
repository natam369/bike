package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Brands;

public interface brandsService {

	List<Brands> getAllBrandsFromDataBase();

	List<Brands> getBranchesWithInvestment(String branchName);

}
