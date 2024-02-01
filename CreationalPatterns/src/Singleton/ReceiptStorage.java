package Singleton;

import java.util.ArrayList;

public class ReceiptStorage {
    private static volatile ReceiptStorage _instance;
    private final ArrayList<Receipt> _storage;
    private ReceiptStorage(){
        _storage = new ArrayList<>();
    }
    public static ReceiptStorage GetInstance(){
        if(_instance == null){
            synchronized (ReceiptStorage.class){
                if(_instance == null){
                    _instance = new ReceiptStorage();
                }
            }
        }
        return _instance;
    }
    public void Add(Receipt receipt){
        _storage.add(receipt);
    }
    public ArrayList<Receipt> GetAll(){
        return _storage;
    }
}
