package com.syntel;

import java.util.List;

public class ProductDAO {
	private List<Product> products = null;

	public ProductDAO(List<Product> products) {
		super();
		this.products = products;
	}
	
	public void save(Product p) {
		
	}
	
	public Product findProduct(String name) {
		
	}
	
	public List<Product> findProductBelowPrice(float price){
		
	}
	public List<Product> findProductAbovePrice(float price){
		
	}
	
	public void updatePrice(String name,float price) {
		
	}
}
