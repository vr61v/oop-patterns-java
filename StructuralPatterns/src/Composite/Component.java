package Composite;

public abstract class Component {
    protected String _name;
    public void Add(Component component){
        throw  new UnsupportedOperationException();
    }
    public void Delete(Component component){
        throw new UnsupportedOperationException();
    }
    public abstract void Print(int level);
}
