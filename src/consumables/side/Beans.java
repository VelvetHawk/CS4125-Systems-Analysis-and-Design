package consumables.side;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Beans extends Food
{
    public Beans(Consumable parent)
    {
        super(parent);
    }

    public Beans(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Beans";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}