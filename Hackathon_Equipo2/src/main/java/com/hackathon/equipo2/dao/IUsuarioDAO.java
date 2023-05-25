package com.hackathon.equipo2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.equipo2.dto.Usuario;

public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findByUsername(String username);
}