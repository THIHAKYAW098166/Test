package com.example.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.web.entity.Product;
import com.example.web.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService produtservice;
	
	@PostMapping("/addProduct")
	public Product addProdut(@RequestBody Product product) {
		return produtservice.saveProduct(product);
	}
	
	@PostMapping("addallProducts")
	public List<Product> addallProduct(@RequestBody List<Product> products){
		return produtservice.saveProducts(products);
	}
	@GetMapping("/allproducts")
	public List<Product> findallProducts(){
		return produtservice.findallProducts();
	}
	@GetMapping("/productbyid/{id}")
	public Product findbyid(@PathVariable int id) {
		return produtservice.findbyId(id);
	}
	@GetMapping("/productbyname/{name}")
	public Product findbyname(@PathVariable String name) {
		return produtservice.findbyName(name);
	}
	@PutMapping("/updateproduct")
		public Product updateProduct(@RequestBody Product product) {
			return produtservice.updateProduct(product);
		}
	@DeleteMapping("/delete/{id}")
	public String deleteproduct(@PathVariable int id) {
		return produtservice.deleteProduct(id);
	}
}
