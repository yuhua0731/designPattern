package prototype;

public class App {
    public static void main(String[] args) {
        Prototype p = new concretePrototype("Robot");
        Prototype p_clone = p.getClone();
        p.show();
        p_clone.show();
        System.out.println("update p's value");
        p.setA("Shuttle");
        p.show();
        p_clone.show();
    }
}
