package consumables.toppings;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Beef extends FoodDecorator
{
    public Beef(Consumable parent)
    {
        super(parent);
    }

    public Beef(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Beef";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}