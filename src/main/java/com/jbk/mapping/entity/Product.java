package com.jbk.mapping.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	private String productId;
	private String productName;
	private String productQty;
	private double productPrice;
	private String productType;
	
	@OneToOne(cascade = CascadeType.ALL)
  //@JoinColumn(name = "sid") if we want to change the name of column in the table
	private Supplier supplier;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(String productId, String productName, String productQty, double productPrice, String productType,
			Supplier supplier) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQty = productQty;
		this.productPrice = productPrice;
		this.productType = productType;
		this.supplier = supplier;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductQty() {
		return productQty;
	}

	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQty=" + productQty
				+ ", productPrice=" + productPrice + ", productType=" + productType + ", supplier=" + supplier + "]";
	}

}
