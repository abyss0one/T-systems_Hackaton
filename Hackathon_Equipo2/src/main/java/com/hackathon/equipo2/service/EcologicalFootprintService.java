package com.hackathon.equipo2.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hackathon.equipo2.dao.IUsuarioDAO;
import com.hackathon.equipo2.dto.Usuario;

@Service
public class EcologicalFootprintService {

	@Autowired
	EcologicalFootprintDAO EcologicalFootprintDAO;

	public List<Country> listCountry() {
		return CountryDAO.findAll();
	}

	public Country saveCountry(Country Country) {
		return CountryDAO.save(Country);
	}

	public Country CountryById(String Country {
		return CountryDAO.findById(Country).get();
	}

	public Country updateCountry(Country Country) {
		return CountryrDAO.save(Country);
	}

	public void deleteCountry(String Country) {
		CountryDAO.deleteById(Country);
	}
}

