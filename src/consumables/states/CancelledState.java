package consumables.states;

public class CancelledState implements State
{
    @Override
    public void doAction(Orders orders)
    {
        System.out.println("Order is in cancelled state");
        orders.setState(this);
    }

    public String toString()
    {
        return "Order cancelled State";
    }
}
