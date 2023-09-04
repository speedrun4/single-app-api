package com.algaworks.single-app.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.single-app.api.model.City;

public interface CityRepository extends JpaRepository<City, Long>{
	
	List<City> findByStateId(Long stateId);
}
