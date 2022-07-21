package mediator;

public class ConcreteMediator extends Mediator {

    public ConcreteMediator(String name) {
        // TODO Auto-generated constructor stub
        this.setName(name);
    }

    @Override
    public void receive(User user, Message msg) {
        // TODO Auto-generated method stub
        if (!user.vip && msg instanceof VoiceMessage) {
            System.out.println(user.name + " is not a vip, you can only send text messages");
            return;
        }

        for (User u : users) {
            if (u.name.equals(user.name)) {
                continue;
            }
            if (msg instanceof TextMessage || u.vip) {
                u.receiveMsg(msg);
            }
        }
    }
}
