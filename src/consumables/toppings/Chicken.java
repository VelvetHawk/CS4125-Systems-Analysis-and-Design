package consumables.toppings;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Chicken extends Food
{
    public Chicken(Consumable parent)
    {
        super(parent);
    }

    public Chicken(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Chicken";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}