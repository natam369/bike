package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dealers;
@Repository
public interface dealersRepository extends JpaRepository<Dealers, Integer>{

	Dealers findBydealerName(String dealerName);

}
