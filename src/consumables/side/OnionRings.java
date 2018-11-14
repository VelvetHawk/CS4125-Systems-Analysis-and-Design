package consumables.side;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class OnionRings extends Food
{
    public OnionRings(Consumable parent)
    {
        super(parent);
    }

    public OnionRings(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Onion Rings";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}
