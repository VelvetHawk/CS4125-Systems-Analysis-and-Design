package consumables.toppings;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Cheese extends FoodDecorator
{
    public Cheese(Consumable parent)
    {
        super(parent);
    }

    public Cheese(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Cheese";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}