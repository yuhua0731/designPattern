package composite;

import java.util.ArrayList;
import java.util.List;

public class Tree extends Component {
    private String name = "";
    private List<Component> children = new ArrayList<>();

    Tree(String name) {
        this.name = name;
    }

    @Override
    void swing() {
        // TODO Auto-generated method stub
        System.out.println(this.name + " starts to swing");
        for (Component comp : this.children) {
            comp.swing();
        }
    }

    @Override
    void add(Component comp) {
        // TODO Auto-generated method stub
        this.children.add(comp);
    }

    @Override
    void remove(Component comp) {
        // TODO Auto-generated method stub
        this.children.remove(comp);
    }

    @Override
    List<Component> getChildren() {
        // TODO Auto-generated method stub
        return this.children;
    }
}
