package proxy;

public class App {
    public static void main(String[] args) {
        RobotProxy rp = new RobotProxy("R1");
        
        for (int i = 0; i < 10; i++) {
            if (i == 5)
                rp.setRobotError();
            rp.robotMove();
            System.out.println("move " + rp.getCount() + " time(s)");
        }
    }
}
