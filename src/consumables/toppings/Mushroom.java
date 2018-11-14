package consumables.toppings;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Mushroom extends FoodDecorator
{
    public Mushroom(Consumable parent)
    {
        super(parent);
    }

    public Mushroom(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Mushroom";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}