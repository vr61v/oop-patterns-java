package Iterator;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        var array = new ArrayList<Integer>();
        var aggregate = new MyAggregate<Integer>(array, 10);
        for(int i = 0; i < 10; ++i) aggregate.add(i);

        var iterator = aggregate.Iterator();
        System.out.println("from: " + iterator.Begin() + " to: " + iterator.End());
        System.out.println("Prev[0]: " + iterator.Prev());
        System.out.println("Current[0]: " + iterator.Current());
        System.out.println("Next[0]: " + iterator.Next());
        System.out.println("IsEnd: " + iterator.IsEnd());
    }
}
