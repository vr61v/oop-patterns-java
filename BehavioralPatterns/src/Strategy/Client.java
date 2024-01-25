package Strategy;

public class Client {
    public static void main(String[] args) {
        int[] collection = new int[10];
        for(int i = 0; i < 10; ++i) collection[i] = i;
        System.out.println("Linear search 10: " + SearchAlgorithm.Search(collection, 10));
        System.out.println("Linear search 4: " + SearchAlgorithm.Search(collection, 4));
        System.out.println("Binary search -1: " + SearchAlgorithm.Search(collection, -1));
        System.out.println("Binary search 8: " + SearchAlgorithm.Search(collection, 8));
    }
}
