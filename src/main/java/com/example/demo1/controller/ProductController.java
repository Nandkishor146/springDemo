package com.example.demo1.controller;

import com.example.demo1.entity.Product;
import com.example.demo1.serviceImpl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
//post Method
    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product)
    {
         return productService.saveProduct(product);
    }
    //add multiple Product
    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products)
    {
        return productService.saveProducts(products);
    }
   @GetMapping("/products")
    public List<Product> findAllProducts()
    {
        return productService.getProducts();
    }
    @GetMapping("/product/{id}")
    public Product findProductById(@PathVariable int id)
    {
        return productService.getProductById(id);
    }
    @GetMapping("/product/{name}")
    public Optional<Object> findProductByName(@PathVariable String name)
    {
        return productService.getProductByName(name);
    }
    @PutMapping("/update")
    public Product updateProduct(Product product)
    {
        return productService.updateProdut(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id)
    {
        return productService.deleteProduct(id);
    }
}
