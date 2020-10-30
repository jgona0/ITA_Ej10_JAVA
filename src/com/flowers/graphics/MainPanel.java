package com.flowers.graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.flowers.application.ShopController;
import com.flowers.tools.Checker;
import com.flowers.tools.Material;


// Clase que implementa la lámina que va dentro del frame y contiene los botones/cajas de texto para que el usuario ponga la inforamción
// e interactue con la interfaz (es por ello que implementa ActionListener) para capturar los eventos.

public class MainPanel extends JPanel  implements ActionListener{
	
	static JTextArea display;
	
	private JTextField create_shop, show_stock;
	private JTextField tree_shop, tree_name, tree_price, tree_height;
	private JTextField flower_shop, flower_name, flower_price, flower_colour;
	private JTextField decoration_shop, decoration_name, decoration_price, decoration_mat;

	private ShopController shopcontroller = new ShopController();

	

	//Constructor donde se inicializan los botones y los cuadros de texto
	public MainPanel() {
		
		// se quita el layout para colocar a traves de pixeles todos los elementos
		setLayout(null);
		
		//Creación de los botones de la interface
		insertButton("Crear floristería",600,310, 150,40);
		insertButton("Ver stock floristería",600,360, 150,40);		
		insertButton("Crear arbol",10,410, 740,20);
		insertButton("Crear flor",10,500, 740,20);
		insertButton("Crear decoración",10,590, 740,20);
		
		//Creación de las cajas de texto mediante un método
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

		//display de arriba del todo que mostrará la información de lo que hace el programa
		display = new JTextArea("Interfaz para crear tiendas y su stock");
		display.setBounds(0,0,800,300);
		display.setEditable(false);
		add(display);
		
		
		// Caja de texto de creación de tienda
		create_shop = new JTextField("Pon nombre a tu tienda y creala con el botón 'Crear floristería'");
		create_shop.setBounds(10,310,550,40);
		add(create_shop);

		// Caja de texto de impresión de stock
		show_stock = new JTextField("Nombre de la tienda que quieres ver el stock?"); 
		show_stock.setBounds(10,360, 550,40);
		add(show_stock);

		
		// Cajas de texto de creación de arbol
		tree_shop = new JTextField("Nombre de la tienda en la que creas el arbol");
		tree_shop.setBounds(10,430, 350,40);
		add(tree_shop);

		tree_name = new JTextField("Nombre del arbol");
		tree_name.setBounds(360,430, 130,40);
		add(tree_name);

		tree_price = new JTextField("Precio");
		tree_price.setBounds(500,430, 130,40);
		add(tree_price);

		tree_height = new JTextField("Altura (cms)");
		tree_height.setBounds(640,430, 110,40);
		add(tree_height);

		
		// Cajas de texto de creación de flor
		flower_shop = new JTextField("Nombre de la tienda en la que creas la flor");
		flower_shop.setBounds(10,520, 350,40);
		add(flower_shop);

		flower_name = new JTextField("Nombre de la flor");
		flower_name.setBounds(360,520, 130,40);
		add(flower_name);

		flower_price = new JTextField("Precio");
		flower_price.setBounds(500,520, 130,40);
		add(flower_price);

		flower_colour = new JTextField("Color");
		flower_colour.setBounds(640,520, 110,40);
		add(flower_colour);
		
		
		// Cajas de texto de creación de decoración
		decoration_shop = new JTextField("Nombre de la tienda en la que creas la decoración");
		decoration_shop.setBounds(10,610, 350,40);
		add(decoration_shop);

		decoration_name = new JTextField("Nombre de la decor.");
		decoration_name.setBounds(360,610, 130,40);
		add(decoration_name);

		decoration_price = new JTextField("Precio");
		decoration_price.setBounds(500,610, 130,40);
		add(decoration_price);

		decoration_mat = new JTextField("Material");
		decoration_mat.setBounds(640,610, 110,40);
		add(decoration_mat);
		
	}
	
	
	// Método de gestión de eventos
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		//recogemos el evento para y actuaremos en función del botón que apriete el usuario
		String entrada = e.getActionCommand();
		
		
		// Si apretamos el botón crear floristería
		if(entrada.equals("Crear floristería")) {
			
			String shop_name = create_shop.getText();
			
			//Si el user no introduce nombre de la tienda imprimimos en la caja de arriba el mensaje de error
			if(shop_name.isEmpty()) {
				
				MainPanel.display.setText("TIENDA NO CREADA: Tienes que poner el nombre de la tienda para crearla");

			//Si hay nombre de tienda, se comprueba si ya existe esa tienda o no y se crea
			}else {
				
				if (shopcontroller.shopExists(shop_name) == true) {
				
					MainPanel.display.setText("TIENDA NO CREADA: Ya hay una tienda con el mismo nombre");
				
				}else {
				
					shopcontroller.createShop(shop_name);
					MainPanel.display.setText("TIENDA CREADA CON NOMBRE: "+shop_name);
				}		
			} 
		}
		
		
		
		// Si apretamos el botón crear floristería
		if(entrada.equals("Ver stock floristería")) {
			
			String shop_name = show_stock.getText();
			
			//Si el user no introduce nombre de la tienda imprimimos en la caja de arriba el mensaje de error
			if(shop_name.isEmpty()) {
				
				MainPanel.display.setText("NO SE PUEDE VER STOCK: Tienes que poner el nombre de la tienda de la que quieras ver el stock");

			//Si hay nombre de tienda, se comprueba si ya existe esa tienda o no, para enseñar el stock
			}else {
				
				if (shopcontroller.shopExists(shop_name) == true) {
				
					MainPanel.display.setText(shopcontroller.showStock(shop_name));

				
				}else {
				
					MainPanel.display.setText("NO SE PUEDE VER STOCK: La tienda no existe" );
				}		
			} 
		}
		
		
		 
		
		// Si apretamos el botón crear arbol
		if(entrada.equals("Crear arbol")) {
			
			String tree_shop_inp = tree_shop.getText();
			String tree_name_inp = tree_name.getText();
			String tree_price_inp =tree_price.getText();
			String tree_height_inp = tree_height.getText();

			try {
				
				//Si alguno de los campos no está rellenado
				if(tree_shop_inp.isEmpty() || tree_name_inp.isEmpty() || tree_price_inp.isEmpty() || tree_height_inp.isEmpty()) {
	
					MainPanel.display.setText("NO SE PUEDE CREAR EL ARBOL: Alguno de los campos está vacío, rellena los 4 campos");
	
				}else {
					
					//Checkeo de que la tienda exista
					if (shopcontroller.shopExists(tree_shop_inp) == true) {
						
						shopcontroller.addTree(tree_name_inp, Double.parseDouble(tree_price_inp), Integer.parseInt(tree_height_inp), tree_shop_inp);
						MainPanel.display.setText("ARBOL CREADO en tienda: " +tree_name_inp);
	
					
					}else {
					
						MainPanel.display.setText("NO SE PUEDE CREAR EL ARBOL: La tienda no existe" );
					}	
					
				}
			
				//capturamos execepción de los campos númericos
			}catch (NumberFormatException e1) {
				
				MainPanel.display.setText("NO SE PUEDE CREAR EL ARBOL: el precio o la altura del arbol no son númericos aceptados \n Precio: si pones decimales hazlo separado por un punto p.ej(35.4) \n Altura: expresala en centimetros, sin decimales" );

			}
		}
		
		
		
		// Si apretamos el botón crear flor
		if(entrada.equals("Crear flor")) {
			
			String flower_shop_inp = flower_shop.getText();
			String flower_name_inp = flower_name.getText();
			String flower_price_inp =flower_price.getText();
			String flower_colour_inp = flower_colour.getText();

			
			try {
				
				//Si alguno de los campos no está rellenado
				if(flower_shop_inp.isEmpty() || flower_name_inp.isEmpty() || flower_price_inp.isEmpty() || flower_colour_inp.isEmpty()) {
	
					MainPanel.display.setText("NO SE PUEDE CREAR LA FLOR: Alguno de los campos está vacío, rellena los 4 campos");
	
				}else {
					
					//Checkeo de que la tienda exista
					if (shopcontroller.shopExists(flower_shop_inp) == true) {
											
						shopcontroller.addFlower(flower_name_inp, Double.parseDouble(flower_price_inp), flower_colour_inp, flower_shop_inp);
						MainPanel.display.setText("FLOR CREADA en tienda: " +flower_name_inp);
	
					
					}else {
					
						MainPanel.display.setText("NO SE PUEDE CREAR LA FLOR: La tienda no existe" );
					}	
					
				}
				//capturamos execepción de los campos númericos
			}catch (NumberFormatException e1){
				
				MainPanel.display.setText("NO SE PUEDE CREAR LA FLOR: el precio de la flor no es númerico aceptado \n Precio: si pones decimales hazlo separado por un punto p.ej(35.4) \n" );

			}
		} 

		
		
		
		// Si apretamos el botón crear decoración
		if(entrada.equals("Crear decoración")) {
			
			String decoration_shop_inp = decoration_shop.getText();
			String decoration_name_inp = decoration_name.getText();
			String decoration_price_inp =decoration_price.getText();
			String decoration_mat_inp = decoration_mat.getText();

			
			try {
				
				//Si alguno de los campos no está rellenado
				if(decoration_shop_inp.isEmpty() || decoration_name_inp.isEmpty() || decoration_price_inp.isEmpty() || decoration_mat_inp.isEmpty()) {
	
					MainPanel.display.setText("NO SE PUEDE CREAR LA DECORACION: Alguno de los campos está vacío, rellena los 4 campos");
	
				// Checkeo del tipo de material	
				}else if (Checker.isMaterial(decoration_mat_inp) == false){
					
					MainPanel.display.setText("NO SE PUEDE CREAR LA DECORACIÓN: El material debe ser PLASTIC o FUSTA");
					
				}else {
					
					//Checkeo de que la tienda exista
					if (shopcontroller.shopExists(decoration_shop_inp) == true) {
						
						Material material = Material.valueOf(decoration_mat_inp.toUpperCase());
						shopcontroller.addDecoration(decoration_name_inp, Double.parseDouble(decoration_price_inp), material, decoration_shop_inp);
						MainPanel.display.setText("DECORACION CREADA en tienda: " +decoration_name_inp);
	
					
					}else {
					
						MainPanel.display.setText("NO SE PUEDE CREAR LA FLOR: La tienda no existe" );
					}	
				
				}
				//capturamos execepción de los campos númericos
			}catch (NumberFormatException e1) {
				
				MainPanel.display.setText("NO SE PUEDE CREAR LA DECORACION: el precio de la decoración no es númerico aceptado \n Precio: si pones decimales hazlo separado por un punto p.ej(35.4) \n" );

			}
		} 

		
	}	
	
}


