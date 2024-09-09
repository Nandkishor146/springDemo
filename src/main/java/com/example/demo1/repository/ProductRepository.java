package com.example.demo1.repository;

import com.example.demo1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Optional<Object> findByName(String name);
}
