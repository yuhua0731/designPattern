package proxy;

public class RobotProxy {
    Integer moveCount;
    Robot r;

    public RobotProxy(String id) {
        this.moveCount = 0;
        this.r = new Robot(id);
    }

    public void robotMove() {
        if (r.isError()) {
            System.out.println("robot has an error, cannot move");
        }
        else {
            this.r.move();
            this.moveCount++;
        }
    }

    public int getCount() {
        return this.moveCount;
    }

    public void setRobotError() {
        this.r.setError(true);
    }
}
