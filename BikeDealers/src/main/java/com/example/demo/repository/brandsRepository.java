package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Brands;
@Repository
public interface brandsRepository extends JpaRepository<Brands, Integer>{

	

	Brands findBybrandName(String brandName);

	

	

}
