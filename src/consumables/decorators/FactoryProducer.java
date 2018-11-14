package consumables.decorators;

import consumables.factories.DrinksFactory;
import consumables.factories.FoodFactory;
import consumables.factories.SidesFactory;
import consumables.factories.ToppingsFactory;

public class FactoryProducer
{
    public static ConsumableFactory getFactory(Consumables type)
    {
        switch (type)
        {
            case TOPPING:
                return new ToppingsFactory();
            case DRINK:
                return new DrinksFactory();
            case FOOD:
                return new FoodFactory();
            case SIDE:
                return new SidesFactory();
            default:
                return null;
        }
    }
}
