package com.back.domain.products;

public class Flower extends Product{

    private String colour;
	
    
	// CONSTRUCTOR

	public Flower(String name, double price, String colour) {
		super(name, price);
        this.colour = colour;
	}

	
	// GETTERS & SETTERS
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	@Override
	public String toString() {
		return "Flower [colour=" + colour + "]";
	}

	
	
	
	
}
