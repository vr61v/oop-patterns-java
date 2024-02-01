package Iterator;

public abstract class Aggregate<T> {
    public abstract Iterator<T> Iterator();
    public abstract int size();
    public abstract T get(int index);
    public abstract void add(T value);
}
