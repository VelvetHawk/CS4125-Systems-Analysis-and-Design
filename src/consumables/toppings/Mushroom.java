package consumables.toppings;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Mushroom extends Food
{
    public Mushroom(Consumable parent)
    {
        super(parent);
    }

    public Mushroom(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Mushroom";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}