package com.veb.inventoryservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veb.inventoryservice.models.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
