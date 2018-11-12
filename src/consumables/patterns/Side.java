package consumables.patterns;

public abstract class Side implements Consumable
{
	// Decorator chain
	protected Consumable parent;
	
	public Side(Consumable parent)
	{
		this.parent = parent;
	}
	
	@Override
	public abstract String getName();
	
	@Override
	public abstract double getCost();
}
