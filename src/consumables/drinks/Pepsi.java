package consumables.drinks;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Drink;

public class Pepsi extends Drink
{
    public Pepsi(Consumable parent)
    {
        super(parent);
    }

    public Pepsi(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Pepsi";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}