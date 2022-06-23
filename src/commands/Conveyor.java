package commands;

public class Conveyor {
    String id;
    
    public Conveyor(String id) {
        this.id = id;
    }

    public void moving() {
        System.out.println(id + " starts to moving");
    }

    public void shutdown() {
        // TODO Auto-generated method stub
        System.out.println(id + " is shutdown");
    }
}
