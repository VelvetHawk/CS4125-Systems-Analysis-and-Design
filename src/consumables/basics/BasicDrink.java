package consumables.basics;

import consumables.decorators.Consumable;

public abstract class BasicDrink implements Consumable
{
	@Override
	public double getCost()
	{
		return 2.00;
	}
}
