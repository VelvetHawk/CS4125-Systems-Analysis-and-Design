package consumables.toppings;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Cheese extends Food
{
    public Cheese(Consumable parent)
    {
        super(parent);
    }

    public Cheese(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Cheese";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}