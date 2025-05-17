package com.example.produtos.produtos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.produtos.produtos.customPagination.PageResponse;
import com.example.produtos.produtos.dtos.ProductDTO;
import com.example.produtos.produtos.entities.Product;
import com.example.produtos.produtos.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;

	
	public PageResponse<ProductDTO> findAll(Pageable pageable){
		
		Pageable page = PageRequest.of(pageable.getPageNumber(), Math.min(pageable.getPageSize(),100),Sort.by("name"));
		Page<Product> products = repository.findAll(page);
		Page<ProductDTO> productDTOPage = products.map(ProductDTO::new);
		return new PageResponse<>(productDTOPage);
	}

	
	
}
