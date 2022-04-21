package abstractFactory;

public class FactoryWindows implements AbstractFactory {

    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new ButtonWindows();
    }

    @Override
    public CheckBox createCheckBox() {
        // TODO Auto-generated method stub
        return new CheckBoxWindows();
    }
}
