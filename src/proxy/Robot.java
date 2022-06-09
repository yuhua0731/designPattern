package proxy;

public class Robot {
    private String id;

    public Robot(String id) {
        this.id = id;
    }

    public void move() {
        System.out.println(this.id + " is moving");
    }
}
