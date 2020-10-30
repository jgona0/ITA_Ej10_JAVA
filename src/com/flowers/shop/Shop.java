package com.flowers.shop;

import java.util.ArrayList;
import java.util.List;

import com.flowers.products.Decoration;
import com.flowers.products.Flower;
import com.flowers.products.Product;
import com.flowers.products.Tree;


// Clase Shop que implementa uan tienda que tiene un nombre, una lista de productos y un id particular
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


	@Override
	public String toString() {
		
	    List<Tree> trees = new ArrayList<>();
	    List<Flower> flowers = new ArrayList<>();
	    List<Decoration> decorations = new ArrayList<>();
		
	    
	    for (Product p: stock) {
			
	    	if(p instanceof Tree) trees.add((Tree) p);
	    	if(p instanceof Flower) flowers.add((Flower) p);
	    	if(p instanceof Decoration) decorations.add((Decoration) p);
	    	
		}
		
		
		String result = "** Shop "+name+ " **\n ARBOLES:";
		
		for (Tree t: trees) {
			result += t.toString();
		}
		
		result += "\n FLORES:";
		
		for (Flower f: flowers) {
			result += f.toString();
		}
		
		result += "\n DECORACIONES: \n";
		
		for (Decoration d: decorations) {
			result += d.toString();
		}
		
		
		return result;
		
	}
    

}


