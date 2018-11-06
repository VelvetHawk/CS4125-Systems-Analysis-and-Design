package consumables.decorators;

import consumables.Size;

public class DrinkDecorator extends ConsumableDecorator
{
	protected Size size;
	
	public Size getSize()
	{
		return size;
	}
	
	public void setSize(Size size)
	{
		this.size = size;
	}
	
	@Override
	public String getName()
	{
		return name;
	}
	
	@Override
	public void setName(String name)
	{
		this.name = name;
	}
	
	@Override
	public void setCost(double cost)
	{
		this.cost = cost;
	}
	
	@Override
	public double getCost()
	{
		return parent.getCost() + cost;
	}
}
