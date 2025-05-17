package com.example.produtos.produtos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.produtos.produtos.customPagination.PageResponse;
import com.example.produtos.produtos.dtos.ProductDTO;
import com.example.produtos.produtos.services.ProductService;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api/v1/product")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<PageResponse<ProductDTO>> findAll(Pageable pageable,@RequestParam(required = false) String name){
		PageResponse<ProductDTO> products = service.findAll(pageable,name);
        return ResponseEntity.ok().body(products);
	}

}
