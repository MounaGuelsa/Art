package com.joseph.repository;


import com.joseph.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository  <Product, Integer>{
}
