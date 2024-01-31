package Composite;

import java.util.ArrayList;

public class Folder extends Component{
    private final ArrayList<Component> _components;
    public Folder(String name){
        _components = new ArrayList<>();
        _name = name;
    }

    @Override
    public void Add(Component component) {
        _components.add(component);
    }

    @Override
    public void Delete(Component component) {
        _components.remove(component);
    }

    @Override
    public void Print(int level) {
        System.out.println(" ".repeat(level) + "+ " + _name);
        for (var component : _components) {
            System.out.print(" ".repeat(level));
            component.Print(level + 1);
        }
    }
}
