package consumables;

import consumables.decorators.DrinkDecorator;
import consumables.decorators.FoodDecorator;
import consumables.decorators.SideDecorator;
import consumables.decorators.ToppingDecorator;
import consumables.drinks.Drinks;
import consumables.states.State;
import consumables.toppings.Toppings;
import javafx.geometry.Side;

import java.util.ArrayList;

public class Order
{
	private int orderNumber;
	private ArrayList<FoodDecorator> food;
	private ArrayList<ToppingDecorator> toppings;
	private ArrayList<SideDecorator> sides;
	private ArrayList<DrinkDecorator> drinks;
	private State orderState;
	
	public double getTotalCost()
	{
		// TODO: Implement method
		return 0;
	}

	public int getOrderNumber()
	{
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber)
	{
		this.orderNumber = orderNumber;
	}

	public ArrayList<FoodDecorator> getFood()
	{
		return food;
	}

	public void setFood(ArrayList<FoodDecorator> food)
	{
		this.food = food;
	}

	public ArrayList<ToppingDecorator> getToppings()
	{
		return toppings;
	}

	public void setToppings(ArrayList<ToppingDecorator> toppings)
	{
		this.toppings = toppings;
	}

	public ArrayList<SideDecorator> getSides()
	{
		return sides;
	}

	public void setSides(ArrayList<SideDecorator> sides)
	{
		this.sides = sides;
	}

	public ArrayList<DrinkDecorator> getDrinks()
	{
		return drinks;
	}

	public void setDrinks(ArrayList<DrinkDecorator> drinks)
	{
		this.drinks = drinks;
	}

	public State getOrderState()
	{
		return orderState;
	}

	public void setOrderState(State orderState)
	{
		this.orderState = orderState;
	}
	
	public void addDrink(DrinkDecorator drink)
	{
		drinks.add(drink);
	}
	
	public void removeDrink(int index)
	{
		drinks.remove(index);
	}
	
	public void addFood(FoodDecorator food)
	{
		this.food.add(food);
	}
	
	public void removeFood(int index)
	{
		food.remove(index);
	}
	
	public void addSide(SideDecorator side)
	{
		sides.add(side);
	}
	
	public void removeSide(int index)
	{
		sides.remove(index);
	}
}
