package Iterator;

public abstract class Iterator<T> {
    public abstract T Begin();
    public abstract T Prev();
    public abstract T Current();
    public abstract T Next();
    public abstract T End();
    public abstract boolean IsEnd();
}
