package consumables.basics;

import consumables.decorators.Consumable;

public abstract class BasicTopping implements Consumable
{
	@Override
	public abstract String getName();
	
	@Override
	public double getCost()
	{
		return 0.25;
	}
}
