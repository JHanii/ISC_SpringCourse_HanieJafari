package ir.freeland.springboot.requestparam.jackson;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfig {
	
	Product tableProduct() {
		Product product = new Product() ;
		product.setName("Table");
		product.setAvailable(true);
		product.setPrice("100");
		return product;
	}
	
	Product laptopProduct() {
		Product product = new Product() ;
		product.setName("Laptop");
		product.setAvailable(true);
		product.setPrice("700");
		return product;
	}
	
	@Bean
	Shop shop() {
		Shop shop = new Shop() ;
		shop.setName("Digikala");
		List<Product> products = List.of( tableProduct() , laptopProduct() );
		shop.setProducts(products);
		return shop;
	}
	
}
