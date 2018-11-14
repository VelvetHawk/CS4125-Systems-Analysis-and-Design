package consumables.drinks;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Drink;

public class Sprite extends Drink
{
    public Sprite(Consumable parent)
    {
        super(parent);
    }

    public Sprite(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "Sprite";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}