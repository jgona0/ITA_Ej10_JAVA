package com.flowers.products;


//Clase arbol que estiende de producto, con su atributo propio de altura y el resto heredados. Es uno de los productos que puede tener la tienda
public class Tree extends Product{

	private int height;
	
	
    
	// CONSTRUCTOR
	public Tree(String name, double price, int height) {
		super(name, price);
        this.height = height;
	}

    
	
	// GETTERS & SETTERS
	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "\t \t -->Arbol:" +name+ " -->Precio:" +price+ " -->Altura:"+height;
	}

	
}
