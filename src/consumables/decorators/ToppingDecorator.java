package consumables.decorators;

public class ToppingDecorator extends ConsumableDecorator
{
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
