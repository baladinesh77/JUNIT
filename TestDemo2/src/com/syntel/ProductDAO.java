package com.syntel;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
	private List<Product> products = null;

	public ProductDAO(List<Product> products) {
		super();
		this.products = products;
	}
	
	public void save(Product p) {
		products.add(p);
	}
	
	public Product findProduct(String name) {
		for(Product p: products) {
			if(p.getName().equalsIgnoreCase(name.trim()))
				return p;
		}
		return null;
	}
	
	public List<Product> findProductBelowPrice(float price){
		List<Product> temp = new ArrayList<>();
		for(Product p : products) {
			if(p.getPrice()<price) {
				temp.add(p);
			}
		}
		return temp;
	}
	public List<Product> findProductAbovePrice(float price){
		List<Product> temp = new ArrayList<>();
		for(Product p : products) {
			if(p.getPrice()>price) {
				temp.add(p);
			}
		}
		return temp;
	}
	
	public void updatePrice(String name,float price) {
		Product p = findProduct(name);
		if(p!=null) {
			p.setPrice(price);
		}
	}
}
