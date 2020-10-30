package com.flowers.graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.flowers.application.ShopController;

public class ButtonTextPanel extends JPanel implements ActionListener{	
	
	
	private JTextField create_shop, show_stock, tree_shop, tree_name, tree_price, tree_height;
	
	// Cremamos el repository para poder empezar a crear shops y sus products
	private ShopController shopcontroller = new ShopController();
	
	public ButtonTextPanel() {
		
		setLayout(null);
				
		insertButton("Crear floristería",300,10, 150,40);
		
		insertButton("Ver stock floristería",300,60, 150,40);
		
		insertButton("Crear arbol",10,150, 150,20);
		insertButton("Crear flor",10,250, 150,20);
		insertButton("Crear decoración",10,350, 150,20);
				
	}
	
	private void insertButton (String name, int px, int py, int sw, int sh) {		
		
		JButton button = new JButton(name);
		button.setBounds(px,py,sw,sh);
		button.addActionListener(this);
		add(button);
		
	}
	
	private void createTextBox(String text, int px, int py, int sw, int sh) {

		create_shop = new JTextField("Pon nombre a tu tienda y creala con el botón 'Crear floristería'");
		create_shop.setBounds(10,10,250,40);
		
		show_stock = new JTextField("Nombre de la tienda que quieres ver el stock?"); 
		show_stock.setBounds(10,60, 250,40);

		
		
		tree_shop = new JTextField("Nombre de la tienda en la que creas el arbol");
		tree_shop.setBounds(10,300, 250,40);

		tree_name = new JTextField("");
		tree_name.setBounds(10,60, 250,40);

		tree_price = new JTextField("");
		tree_price.setBounds(10,60, 250,40);

		tree_height = new JTextField("");
		tree_height.setBounds(10,60, 250,40);

		
		
		
		JTextField text_box = new JTextField(text);
		text_box.setBounds(px,py,sw,sh);
		//button.addActionListener(this);
		add(text_box);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String entrada = e.getActionCommand();
		//MainPanel.display.setText(entrada);
		
		
		if(entrada.equals("Crear floristería")) {
			
			String shop_name = create_shop.getText();
			
			if(shop_name.isEmpty()) {
				
				MainPanel.display.setText("TIENDA NO CREADA: Tienes que poner el nombre de la tienda para crearla");

			}
			shopcontroller.createShop(shop_name);
			
			
			
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