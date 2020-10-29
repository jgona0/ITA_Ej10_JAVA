package com.flowers.products;

import com.flowers.tools.Material;

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
	
}
