package strategy;

public class LinearSearch implements Search {

    public boolean search(int[] collection, int value) {
        for (int t : collection) {
            if (t == value) {
                return true;
            }
        }
        return false;
    }
}
