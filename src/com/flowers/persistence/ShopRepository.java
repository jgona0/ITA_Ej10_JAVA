package com.flowers.persistence;

import java.util.ArrayList;
import java.util.List;

import com.flowers.shop.Shop;


// Clase ShopRepository, que implementa la lista de tiendas que tiene nuestro programa para que se puedan persistir, acceder y anadirles productos.
public class ShopRepository {

	private static List<Shop> shops = new ArrayList<>();


	//CONSTRUCTOR
	public ShopRepository() {

	}
	

	//Metodo que añade una shop a la lista de shops
	public void addShop(Shop shop) {
		shops.add(shop);
	}
	
	
	//GETTERS & SETTERS
	public List<Shop> getShops() {
		return shops;
	}

	public void setShops(List<Shop> shops) {
		ShopRepository.shops = shops;
	}

	
}
