package com.example.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.web.entity.Product;

public interface IProductDAO extends JpaRepository<Product,Integer> {
	Product findByName(String name);
}
