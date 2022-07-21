package mediator;

public class ConcreteUser extends User {
    public ConcreteUser(String name, Boolean vip) {
        // TODO Auto-generated constructor stub
        this.name = name;
        this.vip = vip;
    }

    @Override
    public void receiveMsg(Message msg) {
        System.out.println(this.name + " received a msg: " + msg.getMsg());

    }
    @Override
    public void sendMsg(Message msg) {
        System.out.println(this.name + " sent a msg : " + msg.getMsg() + " to " + this.mediator.getName());
        this.mediator.receive(this, msg);
    }

    @Override
    public void upgrade() {
        this.vip = true;
        System.out.println(this.name + " upgraded vip level");
    }
}
