package mediator;

public class App {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        User user1 = new ConcreteUser("Alice", false);
        User user2 = new ConcreteUser("Bob", true);
        User user3 = new ConcreteUser("Chris", true);

        Mediator mediator = new ConcreteMediator("ChatRoom1");

        mediator.register(user1);
        mediator.register(user2);
        mediator.register(user3);

        user1.sendMsg(new VoiceMessage("voice"));
        user1.sendMsg(new TextMessage("text"));
        user2.sendMsg(new VoiceMessage("voice"));
        user2.sendMsg(new TextMessage("text"));

        // upgrade user1
        user1.upgrade();
        user1.sendMsg(new VoiceMessage("voice"));
    }
}
