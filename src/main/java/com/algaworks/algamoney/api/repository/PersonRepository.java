package com.algaworks.single-app.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.single-app.api.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

	public Page<Person> findByNameContaining(String name, Pageable pageable);

}
