package consumables.basics;

import consumables.decorators.Consumable;

public class BasicDrink implements Consumable
{
	@Override
	public double getCost()
	{
		return 2.00;
	}
}
