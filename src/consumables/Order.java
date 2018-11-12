package consumables;

import consumables.patterns.Drink;
import consumables.patterns.Food;
import consumables.patterns.Side;
import consumables.patterns.Topping;

import java.util.ArrayList;

public class Order
{
	private int orderNumber;
	private ArrayList<Food> food;
	private ArrayList<Topping> toppings;
	private ArrayList<Side> sides;
	private ArrayList<Drink> drinks;
	private Status orderStatus;
	
	public double getTotalCost()
	{
		// TODO: Implement method
		return 0;
	}
}
