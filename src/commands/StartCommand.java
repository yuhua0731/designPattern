package commands;

public class StartCommand implements Command {
    // concrete command
    Robot robot;
    Conveyor conveyor;
        
    public StartCommand(String robotId, String conveyorId) {
        this.robot = new Robot(robotId);
        this.conveyor = new Conveyor(conveyorId);
    }
        
    @Override
    public void run() {
        this.robot.ping();
        this.robot.homing();
        this.robot.moving();
        this.conveyor.moving();
    }
}
