package com.flowers.products;



// Clase producto, que sirve como clase padre de Arbol, Flor y Decoración. (el id está implementado pero finalmente no se está utilizando)
public class Product {
	
	protected String name;
    protected double price;
    private int id;
    private static int next_id = 1;
	
    
    // CONSTRUCTOR
    public Product(String name, double price) {
		this.name = name;
		this.price = price;

		id = next_id;
		next_id++;
	}


	
    // GETTERS & SETTERS
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

    
    
    
}
