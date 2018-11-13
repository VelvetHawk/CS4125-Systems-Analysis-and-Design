package consumables.patterns;

import consumables.Size;
import consumables.food.Burger;
import consumables.food.Kebab;
import consumables.food.Pizza;

public class ConsumableFactory
{
    public Consumable getConsumable(String consumableType)
    {
        if (consumableType == null) {
            return null;
        }
        if (consumableType.equalsIgnoreCase("pizza")) {
            return new Pizza();
        }
        if (consumableType.equalsIgnoreCase("kebab")) {
            return null;//new Kebab();
        }
        if (consumableType.equalsIgnoreCase("burger")) {
            return null;//new Burger();
        }

        return null;
    }
}
