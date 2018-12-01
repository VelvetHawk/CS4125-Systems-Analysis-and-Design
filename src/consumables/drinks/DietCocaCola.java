package consumables.drinks;

import consumables.Size;
import consumables.decorators.Consumable;
import consumables.decorators.DrinkDecorator;

public class DietCocaCola extends DrinkDecorator
{
    public DietCocaCola(Consumable parent)
    {
        super(parent);
    }

    public DietCocaCola(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return parent.getName() + " Diet Coca Cola";
    }

    @Override
    public double getCost()
    {
        return parent.getCost() + 1;
    }
}
