package com.example.produtos.produtos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.produtos.produtos.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
