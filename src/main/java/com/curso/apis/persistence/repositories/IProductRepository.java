package com.curso.apis.persistence.repositories;

import com.curso.apis.persistence.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {

}
