package com.digitalinnovation.experts.productcatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ProductCatalogApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ProductCatalogApplication.class, args);
	}

}
