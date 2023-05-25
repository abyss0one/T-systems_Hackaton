package com.hackathon.equipo2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hackathon.equipo2.dao.EcologicalFootprintDAO;
import com.hackathon.equipo2.dto.EcologicalFootprint;

@Service
public class EcologicalFootprintService {

	@Autowired
	EcologicalFootprintDAO ecologicalFootprintDAO;

	public List<EcologicalFootprint> listCountry() {
		return ecologicalFootprintDAO.findAll();
	}

	/*
	 * public Country saveCountry(Country Country) { return
	 * CountryDAO.save(Country); }
	 */

	public EcologicalFootprint countryByName(String country) {
		return ecologicalFootprintDAO.findById(country).get();
	}
	/*
	 * public Country updateCountry(Country Country) { return
	 * CountryrDAO.save(Country); }
	 * 
	 * public void deleteCountry(String Country) { CountryDAO.deleteById(Country); }
	 */
}

