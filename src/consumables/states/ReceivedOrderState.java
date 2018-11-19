package consumables.states;

public class ReceivedOrderState implements State
{
    public void doAction(Orders orders)
    {
        System.out.println("Order is received");
        orders.setState(this);
    }

    public String toString()
    {
        return "Order received State";
    }
}
