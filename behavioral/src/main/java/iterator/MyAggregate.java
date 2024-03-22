package iterator;

import java.util.List;

public class MyAggregate<T> extends Aggregate<T>{
    private final List<T> aggregate;
    private final int size;

    public MyAggregate(List<T> aggregate, int size) {
        this.aggregate = aggregate;
        this.size = size;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator<>(this);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        return aggregate.get(index);
    }

    @Override
    public void add(T value) {
        aggregate.add(value);
    }
}
