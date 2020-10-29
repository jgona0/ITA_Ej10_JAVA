package com.flowers.products;

public class Tree extends Product{

	private double height;
	
	
    
	// CONSTRUCTOR
	public Tree(String name, double price, double height) {
		super(name, price);
        this.height = height;
	}

    
	
	// GETTERS & SETTERS
	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}

	

	
}
