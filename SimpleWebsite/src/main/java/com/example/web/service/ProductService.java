package com.example.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.web.entity.Product;
import com.example.web.repository.IProductDAO;

@Service
public class ProductService {

	@Autowired
	private IProductDAO dao;
	
	public Product saveProduct(Product product) {
		return dao.save(product);
	}
	public List<Product> saveProducts(List<Product> products){
		return dao.saveAll(products);
	}
	public List<Product> findallProducts(){
		return dao.findAll();
	}
	public Product findbyId(int id) {
		return dao.findById(id).orElse(null);
	}
	public Product findbyName(String name) {
		return dao.findByName(name);
	}
	public String deleteProduct(int id) {
		  dao.deleteById(id);
		  return "product remove "+id;
	}
	public Product updateProduct(Product product) {
		Product exproduct=dao.findById(product.getId()).orElse(null);
		exproduct.setName(product.getName());
		exproduct.setPrice(product.getPrice());
		exproduct.setQuantity(product.getQuantity());
		return dao.save(exproduct);
	}
}
