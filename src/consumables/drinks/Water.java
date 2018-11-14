package consumables.drinks;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Drink;

public class Water extends Drink
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