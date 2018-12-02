package consumables.side;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;
import consumables.decorators.SideDecorator;

public class GarlicBread extends SideDecorator
{
    public GarlicBread(Consumable parent)
    {
        super(parent);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Garlic bread";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}
