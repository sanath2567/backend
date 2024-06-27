package com.product.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(ProductApplication.class, args);
		Main obj = context.getBean(Main.class);

		obj.main();
	}

}
