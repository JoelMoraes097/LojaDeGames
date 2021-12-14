package org.MinhaLojadeGames.MinhaLojadeGames.seguranca;

import java.util.Optional;

import org.MinhaLojadeGames.MinhaLojadeGames.model.Usuario;
import org.MinhaLojadeGames.MinhaLojadeGames.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsuarioRepository userRepository; 
	
	@Override 
	public UserDetailsImpl loadUserByUsername (String userName) {
		Optional <Usuario> user = userRepository.findByUsuario (userName); 
		user.orElseThrow(() -> new UsernameNotFoundException(userName + "not found."));
		return user.map(UserDetailsImpl::new).get();
	}

	
	
}


