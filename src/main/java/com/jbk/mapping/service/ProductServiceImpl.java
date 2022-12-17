package com.jbk.mapping.service;

import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbk.mapping.dao.ProductDao;
import com.jbk.mapping.entity.Product;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao dao;

	
	@Override
	public boolean saveProduct(Product product) {
		String id = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new java.util.Date());
		product.setProductId(id);
		boolean isAdded = dao.saveProduct(product);

		return isAdded;
	}

}
