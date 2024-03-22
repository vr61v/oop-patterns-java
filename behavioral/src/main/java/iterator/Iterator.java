package iterator;

public abstract class Iterator<T> {
    public abstract T begin();
    public abstract T prev();
    public abstract T current();
    public abstract T next();
    public abstract T end();
    public abstract boolean isEnd();
}
