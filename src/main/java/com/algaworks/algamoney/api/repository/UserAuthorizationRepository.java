package com.algaworks.single-app.api.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.single-app.api.model.UserAuthorization;

public interface UserAuthorizationRepository extends JpaRepository<UserAuthorization, Long> {
	
	public Optional<UserAuthorization> findByEmail(String email);
	
	public List<UserAuthorization> findByAuthorizationsDescription(String authorizationsDescription);
	
}
