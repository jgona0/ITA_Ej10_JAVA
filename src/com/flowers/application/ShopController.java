package com.flowers.application;

import java.util.List;

import com.flowers.persistence.ShopRepository;
import com.flowers.products.Decoration;
import com.flowers.products.Flower;
import com.flowers.products.Product;
import com.flowers.products.Tree;
import com.flowers.shop.Shop;
import com.flowers.tools.Material;

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
		shop = (Shop) shops.stream().filter(x -> x.getName().equalsIgnoreCase(name));
		}catch (Exception e) {														
			System.out.println("Shop no encontrada");
		}
		
		return shop;
	}

	public void addTree (String name, double price, double height, String name_shop) {
		
		Shop shop_to_add = selectShopByName(name_shop);
		
		Tree tree = new Tree(name, price, height);
		
		shop_to_add.addProduct(tree);
		
				
	}
	
	public void addFlower (String name, double price, String colour, String name_shop) {
		
		Shop shop_to_add = selectShopByName(name_shop);
		
		Flower flower = new Flower(name, price, colour);
		
		shop_to_add.addProduct(flower);
		
				
	}

	
	public void add (String name, double price, Material material, String name_shop) {
		
		Shop shop_to_add = selectShopByName(name_shop);
		
		Decoration decoration = new Decoration(name, price, material);
		
		shop_to_add.addProduct(decoration);
		
				
	}
	
	public String showStock (String name_shop) {
		
		Shop shop_to_show = selectShopByName(name_shop);

		List<Product> shop_stock = shop_to_show.getStock();
		
		return "";
		
	}

}

