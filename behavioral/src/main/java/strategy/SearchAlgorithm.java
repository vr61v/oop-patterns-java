package strategy;

public class SearchAlgorithm {
    public static boolean search(int[] collection, int value) {
        return search(collection, value, false);
    }

    public static boolean search(int[] collection, int value, boolean isSorted){
        Search search = isSorted ? new BinarySearch() : new LinearSearch();
        return search.search(collection, value);
    }
}
