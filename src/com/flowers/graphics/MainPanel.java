package com.flowers.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


// Clase que implementa la lámina que va dentro del frame y contiene los botones/cajas de texto para que el usuario ponga la inforamción
// e interactue con la interfaz (es por ello que implementa ActionListener) para capturar los eventos.

public class MainPanel extends JPanel  implements ActionListener{
	
	static JButton display;
	
	private JTextField create_shop, show_stock;
	private JTextField tree_shop, tree_name, tree_price, tree_height;
	private JTextField flower_shop, flower_name, flower_price, flower_colour;
	private JTextField decoration_shop, decoration_name, decoration_price, decoration_mat;

	
	//Constructor donde se inicializa el boton de arriba que servirá como display, el resto de botones y cajas de texto
	public MainPanel() {
		
		// se quita el layout para colocar a traves de pixeles todos los elementos
		setLayout(null);
		
		//settings del botón/display de arriba del todo que mostrará la información de lo que hace el programa
		display = new JButton("Interfaz para crear tiendas y su stock");
		display.setEnabled(false);
		display.setBounds(0,0,800,100);
		add(display);

		//Creación de los botones de la interface
		insertButton("Crear floristería",600,110, 150,40);
		insertButton("Ver stock floristería",600,160, 150,40);		
		insertButton("Crear arbol",10,210, 740,20);
		insertButton("Crear flor",10,300, 740,20);
		insertButton("Crear decoración",10,390, 740,20);
		
		//Creación de las cajas de texto
		createTextBox();
		
	}

	
	// Método que crea un botón (y lo pone a escuchar), recibiendo como parametros su nombre, tamaño y posición
	private void insertButton (String name, int px, int py, int sw, int sh) {

		JButton button = new JButton(name);
		button.setBounds(px,py,sw,sh);
		button.addActionListener(this);
		add(button);
		
	}
	
	
	// Método que crea todas las cajas de texto de la interface
	private void createTextBox() {

		// Caja de tezto de creación de tienda
		create_shop = new JTextField("Pon nombre a tu tienda y creala con el botón 'Crear floristería'");
		create_shop.setBounds(10,110,550,40);
		add(create_shop);

		// Caja de texto de impresión de stock
		show_stock = new JTextField("Nombre de la tienda que quieres ver el stock?"); 
		show_stock.setBounds(10,160, 550,40);
		add(show_stock);

		
		// Cajas de texto de creación de arbol
		tree_shop = new JTextField("Nombre de la tienda en la que creas el arbol");
		tree_shop.setBounds(10,230, 350,40);
		add(tree_shop);

		tree_name = new JTextField("Nombre del arbol");
		tree_name.setBounds(360,230, 130,40);
		add(tree_name);

		tree_price = new JTextField("Precio");
		tree_price.setBounds(500,230, 130,40);
		add(tree_price);

		tree_height = new JTextField("Altura");
		tree_height.setBounds(640,230, 110,40);
		add(tree_height);

		
		// Cajas de texto de creación de flor
		flower_shop = new JTextField("Nombre de la tienda en la que creas la flor");
		flower_shop.setBounds(10,320, 350,40);
		add(flower_shop);

		flower_name = new JTextField("Nombre de la flor");
		flower_name.setBounds(360,320, 130,40);
		add(flower_name);

		flower_price = new JTextField("Precio");
		flower_price.setBounds(500,320, 130,40);
		add(flower_price);

		flower_colour = new JTextField("Color");
		flower_colour.setBounds(640,320, 110,40);
		add(flower_colour);
		
		
		// Cajas de texto de creación de decoración
		decoration_shop = new JTextField("Nombre de la tienda en la que creas la decoración");
		decoration_shop.setBounds(10,410, 350,40);
		add(decoration_shop);

		decoration_name = new JTextField("Nombre de la flor");
		decoration_name.setBounds(360,410, 130,40);
		add(decoration_name);

		decoration_price = new JTextField("Precio");
		decoration_price.setBounds(500,410, 130,40);
		add(decoration_price);

		decoration_mat = new JTextField("Material");
		decoration_mat.setBounds(640,410, 110,40);
		add(decoration_mat);
		
	}
	
	
	// Método de gestión de eventos
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String entrada = e.getActionCommand();
		//MainPanel.display.setText(entrada);
		
		
		if(entrada.equals("Crear floristería")) {
			System.out.println("Llamar método de crear floriste");
		} 
		
		if(entrada.equals("Crear arbol")) {
			System.out.println("Llamar método de crear ARBOL");
		} 

		if(entrada.equals("Crear flor")) {
			System.out.println("Llamar método de crear FLOR");
		} 

		if(entrada.equals("Crear decoración")) {
			System.out.println("Llamar método de crear DECO");
		} 

		
	}	
	
}

