package consumables.drinks;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Drink;

public class CocaCola extends Drink
{
    public CocaCola(Consumable parent)
    {
        super(parent);
    }

    public CocaCola(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Coca Cola";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}