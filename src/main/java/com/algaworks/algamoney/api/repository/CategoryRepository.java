package com.algaworks.single-app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.single-app.api.model.Category;

public interface CategoryRepository extends JpaRepository <Category, Long>{

}
