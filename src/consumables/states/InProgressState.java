package consumables.states;

public class InProgressState implements State
{
    @Override
    public void doAction(Orders orders)
    {
        System.out.println("Order is in progress");
        orders.setState(this);
    }

    public String toString()
    {
        return "Progress State";
    }
}
