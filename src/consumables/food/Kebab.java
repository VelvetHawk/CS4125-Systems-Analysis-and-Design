package consumables.food;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Kebab extends Food
{
	public Kebab(Consumable parent)
	{
		super(parent);
	}
	
	public Kebab(Consumable parent, Size size)
	{
		super(parent, size);
	}
	
	@Override
	public String getName()
	{
		return "Kebab";
	}
	
	@Override
	public double getCost()
	{
		return 1;
	}
}
