package iterator;

public class MyIterator<T> extends Iterator<T>{
    private final Aggregate<T> aggregate;
    private int index;

    public MyIterator(Aggregate<T> aggregate) {
        this.aggregate = aggregate;
        index = 0;
    }

    @Override
    public T begin() {
        if(aggregate.size() <= 0) return null;
        return aggregate.get(0);
    }

    @Override
    public T prev() {
        if(index <= 0) return null;
        return aggregate.get(--index);
    }

    @Override
    public T current() {
        if(index < 0 || index >= aggregate.size()) return null;
        return aggregate.get(index);
    }

    @Override
    public T next() {
        if(index >= aggregate.size() - 1) return null;
        return aggregate.get(++index);
    }

    @Override
    public T end() {
        if(aggregate.size() <= 0) return null;
        return aggregate.get(aggregate.size() - 1);
    }

    @Override
    public boolean isEnd() {
        return index >= aggregate.size();
    }
}
