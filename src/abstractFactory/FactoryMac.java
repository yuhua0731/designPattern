package abstractFactory;

public class FactoryMac implements AbstractFactory {
    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new ButtonMac();
    }

    @Override
    public CheckBox createCheckBox() {
        // TODO Auto-generated method stub
        return new CheckBoxMac();
    }
}
