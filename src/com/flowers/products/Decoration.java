package com.flowers.products;

import com.flowers.tools.Material;


//Clase decoración, que extiende de producto, con su atributo material y el resto heredados. Es uno de los productos que puede tener una tienda
public class Decoration  extends Product {

        
    private Material material;
	
	
    // CONSTRUCTOR
	public Decoration(String name, double price, Material material) {
		super(name, price);
    	this.material = material;
	}

	
	// GETTERS & SETTERS
	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}
	
	@Override
	public String toString() {
		return "\t \t -->Decoración:" +name+ " -->Precio:" +price+ " -->Material:"+material;
	}

	
}
