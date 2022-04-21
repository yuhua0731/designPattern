package abstractFactory;

public interface Button {
    public void click();

    public static void commonMsg() {
        System.out.println("show a common button message");
    }
}
