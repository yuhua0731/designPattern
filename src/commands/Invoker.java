package commands;

public class Invoker {
    StartCommand startCommand;
    StopCommand stopCommand;

    public Invoker(String robotId, String conveyorId) {
        this.startCommand = new StartCommand(robotId, conveyorId);
        this.stopCommand = new StopCommand(robotId, conveyorId);
    }

    public void runStart() {
        this.startCommand.run();
    }

    public void runStop() {
        this.stopCommand.run();
    }
}
