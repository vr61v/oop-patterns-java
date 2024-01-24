package Iterator;

import java.util.ArrayList;

public class MyAggregate<T> extends Aggregate<T>{
    private ArrayList _aggregate;
    private final int _size;

    public MyAggregate(ArrayList aggregate, int size) {
        _aggregate = aggregate;
        _size = size;
    }

    @Override
    public Iterator<T> Iterator() {
        return new MyIterator<T>(this);
    }

    @Override
    public int size() {
        return _size;
    }

    @Override
    public T get(int index) {
        return (T) _aggregate.get(index);
    }

    @Override
    public void add(T value) {
        _aggregate.add(value);
    }
}
