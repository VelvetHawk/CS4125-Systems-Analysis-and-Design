package consumables.toppings;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Ham extends Food
{
    public Ham(Consumable parent)
    {
        super(parent);
    }

    public Ham(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Ham";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}