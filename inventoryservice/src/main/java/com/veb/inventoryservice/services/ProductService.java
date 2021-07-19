package com.veb.inventoryservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.veb.inventoryservice.models.Product;
import com.veb.inventoryservice.repositories.ProductRepository;
@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepostiory;
	
	public Product addProduct(Product product) {
		return this.productRepostiory.save(product);
	}
	
	public List<Product> getAllProducts(){
		return this.productRepostiory.findAll();
	}
	
	
	public Product getProductById(long productId) {
		return this.productRepostiory.findById(productId).orElse(null);
	}

}
