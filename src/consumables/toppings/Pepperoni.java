package consumables.toppings;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Pepperoni extends FoodDecorator
{
    public Pepperoni(Consumable parent)
    {
        super(parent);
    }

    public Pepperoni(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return parent.getName() + "Pepperoni";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}