package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Bikes;
import com.example.demo.entity.Brands;
import com.example.demo.entity.Dealers;
import com.example.demo.service.bikesService;
import com.example.demo.service.brandsService;
import com.example.demo.service.dealersService;

@Controller
public class AppController {

	@Autowired
	private bikesService bikesService;

	@Autowired
	private brandsService brandsService;

	@Autowired
	private dealersService dealersService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	/*
	 * @RequestMapping("/assignBrandToDealer") public String assignBrandToDealer() {
	 * return "assignBrandToDealer"; }
	 */

	@RequestMapping("/form")
	public String index1(Model model) {
		List<Brands> brands = brandsService.getAllBrandsFromDataBase();
		List<Dealers> dealers = dealersService.getAllDealersFromDatabase();
		model.addAttribute("Brands", brands);
		model.addAttribute("Dealers", dealers);
		return "brandDealer";
	}

	@RequestMapping("/assignBrandToDealer")
	public String assignBrandToDealer(@RequestParam("brandId") int brandId, @RequestParam("dealerId") int dealerId,
			Model model) {
		// System.out.println(brandId);
		// System.out.println(dealerId);
		model.addAttribute("message", bikesService.assignBrandToDealer(brandId, dealerId));
		return "message";
	}

	@GetMapping("/form1")
	public String index2(Model model) {
		List<Brands> brands = brandsService.getAllBrandsFromDataBase();
		List<Bikes> bikes = bikesService.getAllBikesFromDatabase();
		model.addAttribute("Brands", brands);
		model.addAttribute("Bikes", bikes);
		return "bikeBrand";
	}

	@RequestMapping("/addBikesToBrand")
	public String addBikesToBrand(@RequestParam("brandId") int brandId,@RequestParam("totalInvestment") double totalInvestment, @ModelAttribute Bikes bike, Model model) {

		model.addAttribute("message", bikesService.addBikesToBrand(brandId,totalInvestment, bike));
		return "message";
	}

	@GetMapping("/form2")
	public String index3(Model model) {
		List<Dealers> dealers = dealersService.getAllDealersFromDatabase();
		// List<Bikes> bikes = bikesService.getAllBikesFromDatabase();
		model.addAttribute("Dealers", dealers);
		// model.addAttribute("Bikes", bikes);
		return "dealersBike";
	}

	@RequestMapping("/getAllBikes")
	public String getBikesOfAParticularDealers(@RequestParam("dealerName") String dealerName, Model model) {
		List<Bikes> bikes = bikesService.getBikesOfAParticularDealers(dealerName);
		System.out.println(bikes);
		model.addAttribute("message", bikesService.getBikesOfAParticularDealers(dealerName));
		return "dealersBike";
	}
	@GetMapping("/form3")
	public String index4(Model model) {
		List<Brands> brands = brandsService.getAllBrandsFromDataBase();
		model.addAttribute("Brands", brands);
		
		return "investment";
	}

	@RequestMapping("/getAllBranchesWithInvestment")
	public String getBranchesWithInvestment(@RequestParam("branchName") String branchName, Model model) {
		model.addAttribute("message", brandsService.getBranchesWithInvestment(branchName));
		return "investment";
	}
	
}
