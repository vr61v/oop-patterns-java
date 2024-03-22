package composite;

public abstract class Component {
    protected String name;
    public void add(Component component){
        throw  new UnsupportedOperationException();
    }
    public void delete(Component component){
        throw new UnsupportedOperationException();
    }
    public abstract void print(int level);
}
