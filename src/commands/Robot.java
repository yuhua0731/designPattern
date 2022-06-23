package commands;

public class Robot {
    String id;

    public Robot(String id) {
        this.id = id;
    }

    public void homing() {
        System.out.println(id + " is homing...");
    }

    public void ping() {
        System.out.println(id + " is online");
    }

    public void moving() {
        System.out.println(id + " starts to moving");
    }

    public void shutdown() {
        // TODO Auto-generated method stub
        System.out.println(id + " is shutdown");
    }
}
