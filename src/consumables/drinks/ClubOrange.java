package consumables.drinks;

import consumables.Size;
import consumables.patterns.Consumable;
import consumables.patterns.Drink;

public class ClubOrange extends Drink
{
    public ClubOrange(Consumable parent)
    {
        super(parent);
    }

    public ClubOrange(Consumable parent, Size size)
    {
        super(parent, size);
    }

    @Override
    public String getName()
    {
        return "ClubOrange";
    }

    @Override
    public double getCost()
    {
        return 1;
    }
}
