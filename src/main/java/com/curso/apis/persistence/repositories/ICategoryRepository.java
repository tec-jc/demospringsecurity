package com.curso.apis.persistence.repositories;

import com.curso.apis.persistence.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
