package main;

import display.components.CartListPanel;
import display.views.RegisterLogin;

import javax.swing.*;

public class Restaurant
{
	public static void main(String[] args)
	{
		//RegisterLogin rl = new RegisterLogin();
		
		
		// REMOVE LATER, FOR TESTING
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Setup cart list
		CartListPanel panel = new CartListPanel("Sample Title", '\u20AC', 2);
		panel.setAddItemActionListener(event ->
		{
			panel.addItem(5.00, "Item name", "MEDIUM");
			panel.updateSelf();
			
		});
		for (int i = 0; i < 10; i++)
			panel.addItem(5.00, "Item name", "MEDIUM");
		panel.updateSelf();
		frame.add(panel);
		
		// Setup choice panel
//		StaticChoicePanel<String> panel2 = new StaticChoicePanel<>("Select:");
//		frame.add(panel2);
		
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null); // Center
		frame.setVisible(true);
	}
}
