package consumables.drinks;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Drink;

public class SevenUp extends Drink
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