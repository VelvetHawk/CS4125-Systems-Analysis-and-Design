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
		frame.add(new CartListPanel("Example Title", '\u20AC', 2));
		frame.setSize(400, 500);
		frame.setLocationRelativeTo(null); // Center
		frame.setVisible(true);
	}
}
