package com.back.domain.products;

public class Decoration  extends Product {

    
	//private String material;
    private enum Material {plastic, fusta}
    Material material;
	
	
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
