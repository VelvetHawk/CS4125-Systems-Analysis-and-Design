package consumables.side;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Chips extends Food
{
    public Chips(Consumable parent)
    {
        super(parent);
    }

    public Chips(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Chips";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}