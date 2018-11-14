package consumables;

import consumables.decorators.DrinkDecorator;
import consumables.decorators.FoodDecorator;
import consumables.decorators.SideDecorator;
import consumables.decorators.ToppingDecorator;

import java.util.ArrayList;

public class Order
{
	private int orderNumber;
	private ArrayList<FoodDecorator> food;
	private ArrayList<ToppingDecorator> toppings;
	private ArrayList<SideDecorator> sides;
	private ArrayList<DrinkDecorator> drinks;
	private Status orderStatus;
	
	public double getTotalCost()
	{
		// TODO: Implement method
		return 0;
	}
}
