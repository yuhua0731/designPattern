package composite;

import java.util.List;

public class Leaf extends Component {
    private String name = "";

    Leaf(String name) {
        this.name = name;
    }

    @Override
    void swing() {
        // TODO Auto-generated method stub
        System.out.println(this.name + " starts to swing");
    }

    @Override
    void add(Component comp) {
        // TODO Auto-generated method stub
        // do nothing
    }

    @Override
    void remove(Component comp) {
        // TODO Auto-generated method stub
        // do nothing
    }

    @Override
    List<Component> getChildren() {
        // TODO Auto-generated method stub
        return null;
    }
}
