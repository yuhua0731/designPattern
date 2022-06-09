package proxy;

public class RobotProxy {
    Integer moveCount;
    Robot r;

    public RobotProxy(String id) {
        this.moveCount = 0;
        this.r = new Robot(id);
    }

    public void robotMove() {
        this.r.move();
        this.moveCount++;
    }

    public int getCount() {
        return this.moveCount;
    }
}
