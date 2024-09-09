package com.example.demo1;

import com.example.demo1.entity.Product;
import com.example.demo1.repository.ProductRepository;
import com.example.demo1.service.ProductInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application {
	//ProductInter productInter;
	public static void main(String[] args) {

		SpringApplication.run(Demo1Application.class, args);
		Product product =new Product();
		product.setName("NoteBook");
		product.setQuantity(5);
		product.setPrice(250.00);
		ApplicationContext context = SpringApplication.run(Demo1Application.class, args);
		ProductInter productInter = context.getBean(ProductInter.class);
		productInter.saveProduct(product);
		//productInter.deleteProduct(1);
		System.out.println("Succesfully saved Product changes");
	}

}
