package consumables.states;

public class CreatedState implements State
{
    @Override
    public void doAction(Orders orders)
    {
        System.out.println("Order is in Created state");
        orders.setState(this);
    }

    public String toString()
    {
        return "Progress State";
    }
}
