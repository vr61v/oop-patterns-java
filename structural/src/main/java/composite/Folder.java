package composite;

import java.util.ArrayList;

public class Folder extends Component{
    private final ArrayList<Component> components;
    public Folder(String name){
        components = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void delete(Component component) {
        components.remove(component);
    }

    @Override
    public void print(int level) {
        System.out.println(" ".repeat(level) + "+ " + name);
        for (var component : components) {
            System.out.print(" ".repeat(level));
            component.print(level + 1);
        }
    }
}
