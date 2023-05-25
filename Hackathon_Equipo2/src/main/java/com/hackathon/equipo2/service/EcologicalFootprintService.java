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

	public EcologicalFootprint countryByName(String country) {
		return ecologicalFootprintDAO.findById(country).get();
	}
}

