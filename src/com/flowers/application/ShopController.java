package com.flowers.application;

import java.util.List;
import java.util.Optional;

import com.flowers.persistence.ShopRepository;
import com.flowers.products.Decoration;
import com.flowers.products.Flower;
import com.flowers.products.Tree;
import com.flowers.shop.Shop;
import com.flowers.tools.Material;


// Clase shop controller que interactua con el repositorio de shops para poder anadir elementos al mismo y a las propias tiendas que están dentro. 

public class ShopController {

	
	private ShopRepository repository = new ShopRepository();
	 
	
	//CONSTRUCTOR
	public ShopController() {
		
	}
	
	
	// Metodo que retorna true si ya hay una tienda con ese sino y false si no la hay
	public boolean shopExists (String name) {
		
		//recuepramos la lista de tiendas
		List<Shop> shops = repository.getShops();
		
		//filtramos cuantas tiendas hay con el nombre que nos han pasado
		int num_shops_name = (int) shops.stream()
										.filter(x -> x.getName().equalsIgnoreCase(name))
										.count();
		
		//si el numero de tiendas con ese nombre es diferente de 0, significa que ya hay una tienda con ese nombre y por tanto devolveremos true, sino false
		boolean exit = false;
		if (num_shops_name != 0) exit = true;
		
		return exit;
		
	}
	
	
	//Método que devuelve una shop dado un nombre concreto
	public Shop selectShopByName(String name) {
		
		//recuperamos la lista de shops
		List<Shop> shops = repository.getShops();
		
		//Buscamos la shop y la metemos en un optional por si es nula
		Optional<Shop> shop_opt = shops.stream().filter(x -> x.getName().equalsIgnoreCase(name)).findFirst();  
		Shop shop = new Shop();
		
		//Si encontramos la shop la devolvemos
		try {
			shop = shop_opt.get();
		
		}catch (Exception e) {														
			System.out.println("Shop no encontrada");
		}
		
		return shop;
	}

	
	//Método que crea una shop
	public void createShop (String name) {
		Shop shop = new Shop(name);
		repository.addShop(shop);
		
	}
	
	
	//Método que devuelve el stock de una shop
	public String showStock (String name_shop) {
		
		Shop shop_to_show = selectShopByName(name_shop);

		return shop_to_show.toString();
		
	}
	
	
	//Método que añade un arbol a una tienda
	public void addTree (String name, double price, int height, String name_shop) {
		
		Shop shop_to_add = selectShopByName(name_shop);
		
		Tree tree = new Tree(name, price, height);
		
		shop_to_add.addProduct(tree);
		
				
	}
	
	
	//Método que añade una flor a una tienda
	public void addFlower (String name, double price, String colour, String name_shop) {
		
		Shop shop_to_add = selectShopByName(name_shop);
		
		Flower flower = new Flower(name, price, colour);
		
		shop_to_add.addProduct(flower);
		
				
	}

	
	//Método que añade una decoración a una tienda
	public void addDecoration (String name, double price, Material material, String name_shop) {
		
		Shop shop_to_add = selectShopByName(name_shop);
		
		Decoration decoration = new Decoration(name, price, material);
		
		shop_to_add.addProduct(decoration);
		
				
	}
	

}

