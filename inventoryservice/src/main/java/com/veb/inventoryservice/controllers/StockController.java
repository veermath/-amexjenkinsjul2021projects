package com.veb.inventoryservice.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.veb.inventoryservice.models.Product;
import com.veb.inventoryservice.models.Stock;
import com.veb.inventoryservice.services.ProductService;
import com.veb.inventoryservice.services.StockService;
@RestController
@RequestMapping("/stocks")
public class StockController {
	@Autowired
	private StockService stockService;
	@CrossOrigin("*")
	@PostMapping({"/v1.0/{productId}", "/v1.1/{productId"})
	public ResponseEntity<?> addStock(@RequestBody Stock stock,@PathVariable("productId") long productId){
		
		   Stock stockObj=this.stockService.addStock(stock,productId);
		   if(stockObj!=null) {
			   return ResponseEntity.status(HttpStatus.OK).body(stockObj);
		   }
		   else
			   return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Not Added"); 
		
	}
	
	@GetMapping({"/v1.0", "/v1.1"})
	public List<Stock> getAllStocks(){
		return this.stockService.getAllStocks();
	}
	
}
