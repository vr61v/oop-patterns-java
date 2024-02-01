package Strategy;

public class SearchAlgorithm {
    public static boolean Search(int[] collection, int value) {
        return Search(collection, value, false);
    }

    public static boolean Search(int[] collection, int value, boolean isSorted){
        ISearch search;
        if(isSorted){
            search = new BinarySearch();
        }
        else{
            search = new LinearSearch();
        }
        return search.Search(collection, value);
    }
}
