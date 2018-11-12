package consumables.basics;

import consumables.patterns.Consumable;

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
