package builder;

public class Product {
    private String id;
    private String wheel;
    private String homingSensor;

    public Product(String id) {
        this.id = id;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setHomingSensor(String homingSensor) {
        this.homingSensor = homingSensor;
    }

    public void show() {
        System.out.println("id=" + id + ", wheel=" + wheel + ", homingSensor=" + homingSensor);
    }
}