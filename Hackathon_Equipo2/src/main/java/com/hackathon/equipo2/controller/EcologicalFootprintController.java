package com.hackathon.equipo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.equipo2.dto.EcologicalFootprint;
import com.hackathon.equipo2.service.EcologicalFootprintService;

@RestController
@RequestMapping("/api")
public class EcologicalFootprintController {
	
	@Autowired
	EcologicalFootprintService ecologicalFootprintService;

	@GetMapping("/countries")
	public List<EcologicalFootprint> listCountries() {
		return ecologicalFootprintService.listCountry();
	}

	@GetMapping("/country/{name}")
	public EcologicalFootprint countryById(@PathVariable(name = "name") String name) {
		EcologicalFootprint countryByName = new EcologicalFootprint();

		countryByName = ecologicalFootprintService.countryByName(name);

		return countryByName;
	}
}
