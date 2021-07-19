package com.veb.inventoryservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veb.inventoryservice.models.Product;
import com.veb.inventoryservice.models.Stock;
import com.veb.inventoryservice.repositories.StockRepository;

@Service
public class StockService {
	@Autowired
	private StockRepository stockRepository;
	@Autowired
	private ProductService productService;

	public Stock addStock(Stock stock, long productId) {
		Product product=productService.getProductById(productId);
		stock.setProduct(product);
		return this.stockRepository.save(stock);
	}
	
	public List<Stock> getAllStocks(){
		return this.stockRepository.findAll();
	}
}
