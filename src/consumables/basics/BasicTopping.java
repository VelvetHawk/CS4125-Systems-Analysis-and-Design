package consumables.basics;

import consumables.decorators.Consumable;

public abstract class BasicTopping implements Consumable
{
	@Override
	public double getCost()
	{
		return 0.25;
	}
}
