package com.flowers.view;

import javax.swing.JFrame;

import com.flowers.application.ShopController;
import com.flowers.graphics.Frame;

public class App {

	public static void main(String[] args) {

		//Creamos y configuramos el frame de Java que inicializará todos los componentes para que el usuario pueda interactuar con la interfaz gráfica del programa.
		Frame frame = new Frame();
		
		//Que al cerrar el fram se acabe el programa
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Que sea visible y no se pueda cambiar su tamaño
		frame.setVisible(true);
		frame.setResizable(false);
		
		
	}

}

