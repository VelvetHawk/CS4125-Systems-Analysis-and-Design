package consumables.basics;

import consumables.decorators.Consumable;

public abstract class BasicDrink implements Consumable
{
	@Override
	public abstract String getName();
	
	@Override
	public double getCost()
	{
		return 2.00;
	}
}
