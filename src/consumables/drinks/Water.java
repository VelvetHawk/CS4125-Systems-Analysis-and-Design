package consumables.drinks;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.DrinkDecorator;

public class Water extends DrinkDecorator
{
    public Water(Consumable parent)
    {
        super(parent);
    }

    public Water(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Water";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}