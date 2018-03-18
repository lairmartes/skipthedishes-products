package com.martialdev.hackaton.skipthedishes.products.repos;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.martialdev.hackaton.skipthedishes.products.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Long>{
	
	Product findByName(@Param("name") String name);

}
