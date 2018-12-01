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
        return parent.getName() + "Mushroom";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}