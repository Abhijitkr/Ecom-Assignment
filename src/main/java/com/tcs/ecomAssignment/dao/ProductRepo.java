package com.tcs.ecomAssignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.ecomAssignment.entity.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{}
