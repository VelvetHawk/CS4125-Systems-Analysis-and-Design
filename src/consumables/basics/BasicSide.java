package consumables.basics;

import consumables.decorators.Consumable;

public class BasicSide implements Consumable
{
	@Override
	public double getCost()
	{
		return 1.50;
	}
}
