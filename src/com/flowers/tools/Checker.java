package com.flowers.tools;


//Clase creada a modo de "utilidad" para checkear  campos. Se podrían más utilidades en el futuro
public class Checker {

	//metodo que devuelve ture si un material es correcto para el ENUM Material
	public static boolean isMaterial (String material) {
		
		try {
			Material.valueOf(material);
			return true;
			
		}catch(IllegalArgumentException e) {
			return false;
		
		}
	}	
	
}
