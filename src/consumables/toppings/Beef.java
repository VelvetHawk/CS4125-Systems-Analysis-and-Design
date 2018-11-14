package consumables.toppings;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Beef extends Food
{
    public Beef(Consumable parent)
    {
        super(parent);
    }

    public Beef(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Beef";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}