package com.jbk.mapping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.mapping.entity.Product;
import com.jbk.mapping.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;

	@PostMapping(value = "/saveProduct")
	public ResponseEntity<Boolean> saveProduct(@RequestBody Product product) {// Data validation

		boolean isAdded = service.saveProduct(product);

		if (isAdded) {
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.CREATED);
		} else {
			return new ResponseEntity<Boolean>(isAdded, HttpStatus.INTERNAL_SERVER_ERROR);

		}

	}

}
