package commands;

public class StopCommand implements Command {
    Robot robot;
    Conveyor conveyor;

    public StopCommand(String robotId, String conveyorId) {
        // TODO Auto-generated constructor stub
        this.robot = new Robot(robotId);
        this.conveyor = new Conveyor(conveyorId);
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        this.robot.shutdown();
        this.conveyor.shutdown();
    }
}
