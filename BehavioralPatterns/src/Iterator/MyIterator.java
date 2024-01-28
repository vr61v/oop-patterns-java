package Iterator;

public class MyIterator<T> extends Iterator<T>{
    private final Aggregate<T> _aggregate;
    private int _index;

    public MyIterator(Aggregate<T> aggregate) {
        _aggregate = aggregate;
        _index = 0;
    }

    @Override
    public T Begin() {
        if(_aggregate.size() <= 0) return null;
        return _aggregate.get(0);
    }

    @Override
    public T Prev() {
        if(_index <= 0) return null;
        return _aggregate.get(--_index);
    }

    @Override
    public T Current() {
        if(_index < 0 || _index >= _aggregate.size()) return null;
        return _aggregate.get(_index);
    }

    @Override
    public T Next() {
        if(_index >= _aggregate.size() - 1) return null;
        return _aggregate.get(++_index);
    }

    @Override
    public T End() {
        if(_aggregate.size() <= 0) return null;
        return _aggregate.get(_aggregate.size() - 1);
    }

    @Override
    public boolean IsEnd() {
        return _index >= _aggregate.size();
    }
}
