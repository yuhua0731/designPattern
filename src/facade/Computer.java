package facade;

public class Computer {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDisk hd = new HardDisk();

    public void launch() {
        cpu.start();
        memory.start();
        hd.start();
    }

    public void shutdown() {
        cpu.stop();
        memory.stop();
        hd.stop();
    }
}
