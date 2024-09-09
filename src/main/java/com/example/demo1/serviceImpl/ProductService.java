package com.example.demo1.serviceImpl;

import com.example.demo1.entity.Product;
import com.example.demo1.repository.ProductRepository;
import com.example.demo1.service.ProductInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements ProductInter {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    @Override
    public List<Product> saveProducts(List<Product> products) {
        return productRepository.saveAll(products);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public Optional<Object> getProductByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public String deleteProduct(int id) {
        productRepository.deleteById(id);
        return "Product Removed"+id;
    }

    @Override
    public Product updateProdut(Product product) {
        Product existingProduct=productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return productRepository.save(existingProduct);
    }


// save data post method
    /*public Product saveProduct(Product product)
    {
      return productRepository.save(product);
    }
    //Save data multiple records
    public List<Product> saveProducts(List<Product> products)
    {
        return productRepository.saveAll(products);
    }
    //read  All Product
    public List<Product> getProducts()
    {
        return productRepository.findAll();
    }
    //read product by Id
    public Product getProductById(int id)
    {
        return productRepository.findById(id).orElse(null);
    }
    //search by Name optional
    public Optional<Object> getProductByName(String name)
    {
        return productRepository.findByName(name);
    }
    //Delete product by id
    public String deleteProduct(int id)
    {
        productRepository.deleteById(id);
        return "Product Removed"+id;
    }
    //update By Id
    public Product updateProdut(Product product)
    {
        Product existingProduct=productRepository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return productRepository.save(existingProduct);
    }*/
}
