package consumables.food;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Burger extends Food
{
    public Burger(Consumable parent)
    {
        super(parent);
    }

    public Burger(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Burger";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}