package com.tcs.ecomAssignment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcs.ecomAssignment.entity.Product;
import com.tcs.ecomAssignment.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/add")
	public ResponseEntity<String>  addProduct(@RequestBody Product product) {
		productService.saveProduct(product);
		return ResponseEntity.ok("Product added successfully!");
	}
}
