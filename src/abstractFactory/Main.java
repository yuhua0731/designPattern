package abstractFactory;

public class Main {
    public static void app(AbstractFactory factory) {
        System.out.println("==============================");
        Button button = factory.createButton();
        CheckBox checkBox = factory.createCheckBox();
        button.click();
        Button.commonMsg();
        checkBox.check();
    }

    public static void main(String[] args) {
        app(new FactoryWindows());
        app(new FactoryMac());
    }
}
