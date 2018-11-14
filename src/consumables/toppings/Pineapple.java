package consumables.toppings;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Pineapple extends Food
{
    public Pineapple(Consumable parent)
    {
        super(parent);
    }

    public Pineapple(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Pineapple";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}