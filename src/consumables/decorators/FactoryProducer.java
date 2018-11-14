package consumables.decorators;

import consumables.factories.ToppingsFactory;

public class FactoryProducer
{
    public static ConsumableFactory getFactory(Consumables type)
    {
        switch (type)
        {
            case TOPPING:
                return new ToppingsFactory();
            default:
                return null;
        }
    }
}
