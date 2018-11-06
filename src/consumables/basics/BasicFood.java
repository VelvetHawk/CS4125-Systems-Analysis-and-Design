package consumables.basics;

import consumables.decorators.Consumable;

public class BasicFood implements Consumable
{
	@Override
	public double getCost()
	{
		return 3.50;
	}
}
