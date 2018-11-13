package consumables.toppings;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Pepperoni extends Food
{
    public Pepperoni(Consumable parent)
    {
        super(parent);
    }

    public Pepperoni(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Pepperoni";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}