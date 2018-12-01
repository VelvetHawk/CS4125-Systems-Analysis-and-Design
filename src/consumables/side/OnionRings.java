package consumables.side;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class OnionRings extends FoodDecorator
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
        return parent.getName() + " Onion Rings";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}
