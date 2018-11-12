package consumables.patterns;

public class ConsumableFactory
{
    public Consumable getConsumable(String consumableType) {
        if (consumableType == null) {
            return null;
        }
        if (consumableType.equalsIgnoreCase("kebab")) {
            // return new kebab
        }
        return null;
    }

}
