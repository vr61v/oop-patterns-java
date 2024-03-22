package iterator;

public abstract class Aggregate<T> {
    public abstract Iterator<T> iterator();
    public abstract int size();
    public abstract T get(int index);
    public abstract void add(T value);
}
