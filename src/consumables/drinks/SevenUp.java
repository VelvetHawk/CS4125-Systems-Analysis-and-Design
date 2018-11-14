package consumables.drinks;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.DrinkDecorator;

public class SevenUp extends DrinkDecorator
{
    public SevenUp(Consumable parent)
    {
        super(parent);
    }

    public SevenUp(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "7Up";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}