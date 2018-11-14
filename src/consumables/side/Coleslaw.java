package consumables.side;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class Coleslaw extends Food
{
    public Coleslaw(Consumable parent)
    {
        super(parent);
    }

    public Coleslaw(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Coleslaw";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}