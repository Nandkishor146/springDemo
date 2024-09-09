package com.example.demo1.service;

import com.example.demo1.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductInter {
    Product saveProduct(Product product);
    List<Product> saveProducts(List<Product> products);
    List<Product> getProducts();
    Product getProductById(int id);
    Optional<Object> getProductByName(String name);
    String deleteProduct(int id);
    Product updateProdut(Product product);
}
