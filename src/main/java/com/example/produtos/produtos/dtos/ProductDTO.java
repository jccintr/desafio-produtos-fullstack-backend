package com.example.produtos.produtos.dtos;

import com.example.produtos.produtos.entities.Product;

public record ProductDTO(String name,Double price) {
	
	public ProductDTO(Product entity) {
		this(entity.getName(),entity.getPrice());
	}

}
