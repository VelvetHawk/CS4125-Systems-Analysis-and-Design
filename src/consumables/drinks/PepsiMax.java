package consumables.drinks;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Drink;

public class PepsiMax extends Drink
{
    public PepsiMax(Consumable parent)
    {
        super(parent);
    }

    public PepsiMax(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Pepsi Max";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}