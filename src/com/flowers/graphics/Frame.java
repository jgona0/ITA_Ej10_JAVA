package com.flowers.graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;


// Clase que crea el frame principal de la interfaz gráfica y directamente añade la única lámina que tendrá en su interior
public class Frame extends JFrame{

	private JPanel main_panel;
	
	//Constructor del frame, al iniciarlo se crea con un título y un tamaño/posición
	public Frame() {
		
		setTitle("Shop creator");
		setBounds(100,100,800,700);
		
		main_panel = new MainPanel();
		add(main_panel);

	}

	
}

