package consumables.factories;

import consumables.basics.BasicTopping;
import consumables.decorators.Consumable;
import consumables.decorators.ConsumableFactory;
import consumables.toppings.Beef;
import consumables.toppings.Cheese;
import consumables.toppings.Toppings;

public class ToppingsFactory extends ConsumableFactory
{
    @Override
    public Consumable getTopping()
    {
        return new BasicTopping();
    }

    @Override
    public Consumable addTopping(Toppings type, Consumable addTo)
    {
        switch (type)
        {
            case BEEF:
                return new Beef(addTo);
            case CHEESE:
                return new Cheese(addTo);
            default:
                return null;
        }
    }
}
