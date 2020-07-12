package pattern.behavioral.state;

/**
 * Component Interface of the decorator pattern– The interface or abstract class defining the methods that will be implemented. In this case, State will be the component interface.
 * and doAction will have the dynamic behaviour at runtime depending on the state of the TV
 */
public interface State {

    public void doAction();
}