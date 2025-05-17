package com.example.produtos.produtos.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.produtos.produtos.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {
	
	Page<Product> findByNameContainingIgnoreCase(String name, Pageable pageable);

}
