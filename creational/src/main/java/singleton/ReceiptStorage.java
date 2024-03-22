package singleton;

import java.util.ArrayList;

public class ReceiptStorage {
    private static volatile ReceiptStorage instance;
    private final ArrayList<Receipt> storage;
    private ReceiptStorage(){
        storage = new ArrayList<>();
    }
    public static ReceiptStorage GetInstance(){
        if(instance == null){
            synchronized (ReceiptStorage.class){
                if(instance == null){
                    instance = new ReceiptStorage();
                }
            }
        }
        return instance;
    }
    public void add(Receipt receipt){
        storage.add(receipt);
    }
    public ArrayList<Receipt> getAll(){
        return storage;
    }
}
