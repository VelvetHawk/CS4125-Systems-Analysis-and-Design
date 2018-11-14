package consumables.side;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Coleslaw extends FoodDecorator
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