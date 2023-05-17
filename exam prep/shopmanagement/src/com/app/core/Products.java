package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Products implements Serializable {
	private String productId;
	private String name;
	private String desc;
	private int quantity;
	private double price;
	private Category productCategory;
	private LocalDate manufactureDate;
	public Products(String productId, String name, String desc, int quantity, double price, Category productCategory,
			LocalDate manufactureDate) {
		super();
		this.productId = productId;
		this.name = name;
		this.desc = desc;
		this.quantity = quantity;
		this.price = price;
		this.productCategory = productCategory;
		this.manufactureDate = manufactureDate;
	}
	
	
	  public boolean equals (Object o) { 
		  if(o instanceof Products)
			  return this.productId.equals(((Products)o).productId); 
	  return false;
	  
	  }
	 
	
	public Products(String newproductId) {
		this.productId = productId;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", desc=" + desc + ", quantity=" + quantity
				+ ", price=" + price + ", productCategory=" + productCategory + ", manufactureDate=" + manufactureDate
				+ "]";
	}
	
	public String getProductId() {
		return productId;
	}
	public String getName() {
		return name;
	}
	public String getDesc() {
		return desc;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	public Category getProductCategory() {
		return productCategory;
	}
	public LocalDate getManufactureDate() {
		return manufactureDate;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
