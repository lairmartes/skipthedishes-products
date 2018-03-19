package com.github.lairmartes.hackaton.skipthedishes.products.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.github.lairmartes.hackaton.skipthedishes.products.entities.Product;
import com.github.lairmartes.hackaton.skipthedishes.products.repos.ProductRepository;

@RepositoryRestController
@RequestMapping(value="/", method=RequestMethod.GET)
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@GetMapping("/{id}")
	public ResponseEntity<PersistentEntityResource> checkin(@PathVariable Long id, PersistentEntityResourceAssembler assembler) {
		
		Optional<Product> askProduct = productRepository.findById(id);
		
		if (!askProduct.isPresent()) {
			throw new ResourceNotFoundException("Product id " + id + " not found");
		}
		
		Product product = askProduct.get();

		return ResponseEntity.ok(assembler.toResource(product));
	}
}
