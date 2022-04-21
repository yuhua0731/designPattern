package builder;

public abstract class Builder {
    abstract void buildWheel();

    abstract void buildHomingSensor();

    abstract Product getResult();
}