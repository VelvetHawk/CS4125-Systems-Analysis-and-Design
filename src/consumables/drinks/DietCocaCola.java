package consumables.drinks;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Drink;

public class DietCocaCola extends Drink
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
        return "Diet Coca Cola";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}
