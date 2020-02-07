package com.example.demo.service.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dealers;
import com.example.demo.repository.dealersRepository;
import com.example.demo.service.dealersService;
@Service
public class dealersServiceImpl implements dealersService{
	
	@Autowired
	private dealersRepository dealersRepo;

	@Override
	public List<Dealers> getAllDealersFromDatabase() {
		
		return dealersRepo.findAll();
	}
	
	

}
