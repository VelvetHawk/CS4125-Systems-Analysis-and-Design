package consumables.side;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Food;

public class GarlicBread extends Food
{
    public GarlicBread(Consumable parent)
    {
        super(parent);
    }

    public GarlicBread(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Garlic bread";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}
