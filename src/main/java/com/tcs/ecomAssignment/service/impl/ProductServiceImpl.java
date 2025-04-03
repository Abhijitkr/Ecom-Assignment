package com.tcs.ecomAssignment.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.ecomAssignment.dao.ProductRepo;
import com.tcs.ecomAssignment.entity.Product;
import com.tcs.ecomAssignment.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepo productRepo;

	@Override
	public void saveProduct(Product product) {
		if (product != null && product.getName() != null && !product.getName().trim().isEmpty()
				&& product.getPrice() > 0)
			productRepo.save(product);
		else {
	        throw new IllegalArgumentException("Invalid product details");
	    }
	}

}
