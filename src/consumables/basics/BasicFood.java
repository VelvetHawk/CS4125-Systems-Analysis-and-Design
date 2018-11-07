package consumables.basics;

import consumables.decorators.Consumable;

public abstract class BasicFood implements Consumable
{
	@Override
	public abstract String getName();
	
	@Override
	public double getCost()
	{
		return 3.50;
	}
}
