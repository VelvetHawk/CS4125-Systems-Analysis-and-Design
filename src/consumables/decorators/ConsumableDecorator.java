package consumables.decorators;

public abstract class ConsumableDecorator implements Consumable
{
	// Decorator chain
	protected Consumable parent;
	
	protected String name;
	protected double cost;
	
	// Abstract methods
	public abstract String getName();
	public abstract void setName(String name);
	public abstract void setCost(double cost);
	
	@Override
	public abstract double getCost();
}
