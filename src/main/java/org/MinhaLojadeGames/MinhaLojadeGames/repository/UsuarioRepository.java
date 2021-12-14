package org.MinhaLojadeGames.MinhaLojadeGames.repository;

import java.util.Optional;

import org.MinhaLojadeGames.MinhaLojadeGames.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
	public Optional<Usuario> findByUsuario(String usuario);
	}

