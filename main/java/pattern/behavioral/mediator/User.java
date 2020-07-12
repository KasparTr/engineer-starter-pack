package pattern.behavioral.mediator;

public abstract class User {
    // Notice a reference to the mediator object, it’s required for the communication between different users.
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name){
        this.mediator=med;
        this.name=name;
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}