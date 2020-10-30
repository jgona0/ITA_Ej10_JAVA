package com.flowers.products;


//Clase flor, que extiende de producto, con su atributo color y el resto heredados. Es uno de los productos que puede tener una tienda
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
		return "\t \t -->Flor:" +name+ " -->Precio:" +price+ " -->Color:"+colour;
	}

	
	
	
	
}
