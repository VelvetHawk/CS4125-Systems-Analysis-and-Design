package consumables.basics;

import consumables.patterns.Consumable;

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
