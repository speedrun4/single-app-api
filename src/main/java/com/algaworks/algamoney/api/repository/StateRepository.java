package com.algaworks.single-app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.single-app.api.model.State;

public interface StateRepository extends JpaRepository<State, Long>{

	
}
