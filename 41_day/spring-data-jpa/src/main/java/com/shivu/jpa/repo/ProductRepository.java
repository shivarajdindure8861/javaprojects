package com.shivu.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivu.jpa.domain.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{
    
}
