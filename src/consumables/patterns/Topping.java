package consumables.patterns;

public abstract class Topping implements Consumable
{
	// Decorator chain
	protected Consumable parent;
	
	public Topping(Consumable parent)
	{
		this.parent = parent;
	}
	
	@Override
	public abstract String getName();
	
	@Override
	public abstract double getCost();
}
