package proxy;

public class Robot {
    private String id;
    private Boolean error;

    public Robot(String id) {
        this.id = id;
        this.error = false;
    }

    public void move() {
        System.out.println(this.id + " is moving");
    }

    public boolean isError() {
        return error;
    }

    public void setError(Boolean error) {
        this.error = error;
    }
}
