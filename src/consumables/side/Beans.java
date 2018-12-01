package consumables.side;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Beans extends FoodDecorator
{
    public Beans(Consumable parent)
    {
        super(parent);
    }

    public Beans(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Beans";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}