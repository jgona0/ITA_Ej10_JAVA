package com.back.application;

import java.util.List;
import java.util.Optional;

import com.back.domain.shop.Shop;
import com.back.persistence.ShopRepository;

public class ShopController {

	private ShopRepository repository = new ShopRepository();
	 
	
	//CONSTRUCTOR
	public ShopController() {
		
	}
	
	
	public void createShop (String name) {
		Shop shop = new Shop (name);
		repository.addShop(shop);
		
	}
	
	public Shop selectShopByName(String name) {
		
		List<Shop> shops = repository.getShops();
		Shop shop = new Shop();
		
		try {
		shop = shops.stream().filter(x -> x.getName().equalsIgnoreCase(name)).findFirst();
		}catch (Exception e) {														//catch
			System.out.println("Shop no encontrada");
		}
	}

	public void addTree (String name, double price, double height, String shop) {
		
	}

}

