package com.algaworks.single-app.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.algaworks.single-app.api.model.City;
import com.algaworks.single-app.api.repository.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityResource {

	@Autowired
	private CityRepository cityRepository;
	
	@GetMapping
	@PreAuthorize("isAuthenticated()")
	public List<City> search(@RequestParam Long state) {
		return cityRepository.findByStateId(state);
	}
}
