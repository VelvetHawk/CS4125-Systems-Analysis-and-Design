package consumables.basics;

import consumables.patterns.Consumable;

public abstract class BasicSide implements Consumable
{
	@Override
	public abstract String getName();
	
	@Override
	public double getCost()
	{
		return 1.50;
	}
}
