package com.hackathon.equipo2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.equipo2.dto.EcologicalFootprint;

public interface EcologicalFootprintDAO extends JpaRepository<EcologicalFootprint, String>{
	
}
