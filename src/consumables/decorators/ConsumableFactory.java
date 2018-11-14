package consumables.decorators;

import consumables.toppings.Toppings;

public abstract class ConsumableFactory
{
    public abstract Consumable getTopping();
    public abstract Consumable addTopping(Toppings type, Consumable addTo);
}
