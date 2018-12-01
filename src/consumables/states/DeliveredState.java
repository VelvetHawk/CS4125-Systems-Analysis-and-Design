package consumables.states;

public class DeliveredState implements State
{
    @Override
    public void doAction(Orders orders)
    {
        System.out.println("Order is in delivered state");
        orders.setState(this);
    }

    public String toString()
    {
        return "Delivered State";
    }
}
