package consumables.states;

public class PlaceOrderState implements State
{
    public void doAction(Orders orders)
    {
        System.out.println("Order is in Progress state");
        orders.setState(this);
    }

    public String toString()
    {
        return "Progress State";
    }
}