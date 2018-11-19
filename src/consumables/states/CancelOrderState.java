package consumables.states;

public class CancelOrderState implements State
{
    public void doAction(Orders orders)
    {
        System.out.println("Order is in cancel state");
        orders.setState(this);
    }

    public String toString()
    {
        return "Order cancel State";
    }
}
