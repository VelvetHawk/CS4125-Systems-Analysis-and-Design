package consumables.toppings;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.FoodDecorator;

public class Pineapple extends FoodDecorator
{
    public Pineapple(Consumable parent)
    {
        super(parent);
    }

    public Pineapple(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Pineapple";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}