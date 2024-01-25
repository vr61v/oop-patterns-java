package Strategy;

public class Client {
    public static void main(String[] args) {
        int[] collection = new int[10];
        for(int i = 0; i < 10; ++i) collection[i] = i;
        System.out.println(SearchAlgorithm.Search(collection, 5, true));
    }
}
