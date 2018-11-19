package consumables.states;

public class Orders
{
    private State state;

    public Orders()
    {
        state = null;
    }

    public void setState(State state)
    {
        this.state = state;
    }

    public State getState()
    {
        return state;
    }
}