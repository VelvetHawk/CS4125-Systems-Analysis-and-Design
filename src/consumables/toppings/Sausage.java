package consumables.toppings;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Sausage extends FoodDecorator
{
    public Sausage(Consumable parent)
    {
        super(parent);
    }

    public Sausage(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Sausage";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}