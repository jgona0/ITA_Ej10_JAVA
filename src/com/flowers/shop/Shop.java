package com.flowers.shop;

import java.util.ArrayList;
import java.util.List;

import com.flowers.products.Product;


public class Shop {

	private String name;
    private List<Product> stock = new ArrayList<>();
    private int id;
    private static int next_id = 1;
	
    
    // CONSTRUCTOR
    public Shop() {
    	
    }
    
    public Shop(String name){
    	this.name = name;
    	id = next_id;
    	next_id++;
    }


    //MÉTODO PARA AÑADIR PRODUCTOS A LA TIENDA
    public void addProduct (Product product) {
    	stock.add(product);
    }
    

    //GETTERS & SETTERS
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Product> getStock() {
		return stock;
	}


	public void setStock(List<Product> stock) {
		this.stock = stock;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


    

}


