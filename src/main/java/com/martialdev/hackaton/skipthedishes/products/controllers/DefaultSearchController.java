package com.martialdev.hackaton.skipthedishes.products.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.martialdev.hackaton.skipthedishes.products.entities.Product;
import com.martialdev.hackaton.skipthedishes.products.repos.ProductRepository;

@RepositoryRestController
@RequestMapping(value="/search", method=RequestMethod.GET)
public class DefaultSearchController {

	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/{name}")
	public ResponseEntity<PersistentEntityResource> checkin(@PathVariable String name, PersistentEntityResourceAssembler assembler) {
		
		Product product = productRepository.findByName(name);

		return ResponseEntity.ok(assembler.toResource(product));
	}
}
