package mediator;

public abstract class User {
    protected String name;
    protected Mediator mediator;
    protected Boolean vip;

    public abstract void receiveMsg(Message msg);

    public abstract void sendMsg(Message msg);

    public abstract void upgrade();
}
