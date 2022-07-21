package mediator;

import java.util.ArrayList;
import java.util.List;

public abstract class Mediator {
    private String name;
    protected List<User> users = new ArrayList<>();

    public void register(User user) {
        user.mediator = this;
        this.users.add(user);
        System.out.println(user.name + " entered " + this.name);
    }

    public abstract void receive(User user, Message msg);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
