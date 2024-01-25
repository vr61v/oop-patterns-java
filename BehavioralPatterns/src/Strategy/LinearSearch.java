package Strategy;

public class LinearSearch implements ISearch {

    @Override
    public boolean Search(int[] collection, int value) {
        for (int t : collection) {
            if (t == value) {
                return true;
            }
        }
        return false;
    }
}
