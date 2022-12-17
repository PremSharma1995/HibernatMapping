package com.jbk.mapping.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Supplier {

	@Id
	private int supplierId;
	private String supplierName;
	private String supplierAddress;
	
	@OneToMany(mappedBy = "Supplier" , cascade = CascadeType.ALL)
	private List<Product> products;

	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(int supplierId, String supplierName, String supplierAddress) {
		super();
		this.supplierId = supplierId;
		this.supplierName = supplierName;
		this.supplierAddress = supplierAddress;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public String getSupplierAddress() {
		return supplierAddress;
	}

	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}

	@Override
	public String toString() {
		return "Supplier [supplierId=" + supplierId + ", supplierName=" + supplierName + ", supplierAddress="
				+ supplierAddress + "]";
	}

}
