package composite;

import java.util.List;

public abstract class Component {
    abstract void swing();

    abstract void add(Component comp);

    abstract void remove(Component comp);

    abstract List<Component> getChildren();
}
