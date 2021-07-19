package com.veb.inventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veb.inventoryservice.models.Stock;

public interface StockRepository extends JpaRepository<Stock,Long>{

}
