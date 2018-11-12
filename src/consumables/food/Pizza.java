package consumables.food;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Pizza extends Food
{
    public Pizza(Consumable parent)
    {
        super(parent);
    }

    public Pizza(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Pizza";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}