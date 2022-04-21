package builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Product construct() {
        this.builder.buildWheel();
        this.builder.buildHomingSensor();
        return this.builder.getResult();
    }
}