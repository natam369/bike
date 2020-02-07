package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Dealers;

@Service
public interface dealersService {

	List<Dealers> getAllDealersFromDatabase();

}
