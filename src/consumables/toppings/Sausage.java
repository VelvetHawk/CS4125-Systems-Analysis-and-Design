package consumables.toppings;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Sausage extends Food
{
    public Sausage(Consumable parent)
    {
        super(parent);
    }

    public Sausage(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Sausage";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}