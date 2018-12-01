package display.components;

import java.util.ArrayList;

public class Order
{
	private int orderNumber;
	private ArrayList<String> food;
	private ArrayList<String> toppings;
	private ArrayList<String> sides;
	private ArrayList<String> drinks;
	private String orderStatus;
	
	public ArrayList<String> getFood()
	{
		return food;
	}
	
	public double getTotalCost()
	{
		// TODO: Implement method
		return 0;
	}
}
