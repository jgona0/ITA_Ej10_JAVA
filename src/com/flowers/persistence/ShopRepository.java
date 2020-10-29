package com.flowers.persistence;

import java.util.List;

import com.flowers.shop.Shop;

public class ShopRepository {

	private static List<Shop> shops;


	//CONSTRUCTOR
	public ShopRepository() {
		//shops = new ArrayList<>();
	}
	
	
	//GETTERS & SETTERS
	public List<Shop> getShops() {
		return shops;
	}

	public void setShops(List<Shop> shops) {
		ShopRepository.shops = shops;
	}

	
	public void addShop(Shop shop) {
		shops.add(shop);
	}
	
}
