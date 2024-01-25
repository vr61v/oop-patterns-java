package Strategy;

public class BinarySearch implements ISearch {
    @Override
    public boolean Search(int[] collection, int value) {
        int left = 0, right = collection.length;
        while (left < right - 1){
            int middle = (left + right) / 2;
            if(collection[middle] < value){
                left = middle;
            }
            else if (collection[middle] > value){
                right = middle - 1;
            }
            else{
                return true;
            }
        }
        return collection[left] == value;
    }
}
