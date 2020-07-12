package pattern.behavioral.state;

/**
 * Decorator, implements the component interface (State) while also having a HAS-A relationship with the component interface itself
 */
public class TVContext implements State {

    private State tvState;

    public void setState(State state) {
        this.tvState=state;
    }
    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();

    }

}