package com.back.persistence;

import java.util.ArrayList;
import java.util.List;

import com.back.domain.shop.Shop;

public class ShopRepository {

	private static List<Shop> shops;


	//CONSTRUCTOR
	public ShopRepository() {
		//shops = new ArrayList<>();
	}
	
	
	//GETTERS & SETTERS
	public static List<Shop> getShops() {
		return shops;
	}

	public static void setShops(List<Shop> shops) {
		ShopRepository.shops = shops;
	}

	
	public void addShop(Shop shop) {
		shops.add(shop);
	}
	
}
