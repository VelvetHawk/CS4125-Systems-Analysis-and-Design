package consumables.side;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class GarlicBread extends FoodDecorator
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
