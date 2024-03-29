package singleton;
import java.util.Calendar;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        final int YEAR = 2024 - 1900;
        final var MONTH = Calendar.JANUARY;

        var LatteThread = new Thread(() -> {
            var storage = ReceiptStorage.GetInstance();
            for(int i = 15; i < 30; i += 4){
                storage.add(new Receipt("Latte", new Date(YEAR, MONTH, i), 240));
            }
        });
        var CappuccinoThread = new Thread(() -> {
            var storage = ReceiptStorage.GetInstance();
            for(int i = 15; i < 30; i += 3){
                storage.add(new Receipt("Cappuccino", new Date(YEAR, MONTH, i), 270));
            }
        });
        var EspressoThread = new Thread(() -> {
            var storage = ReceiptStorage.GetInstance();
            for(int i = 15; i < 30; i += 2){
                storage.add(new Receipt("Espresso", new Date(YEAR, MONTH, i), 190));
            }
        });

        LatteThread.start();
        CappuccinoThread.start();
        EspressoThread.start();

        try {
            LatteThread.join();
            CappuccinoThread.join();
            EspressoThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        var storage = ReceiptStorage.GetInstance();
        for(var i : storage.getAll()){
            System.out.println(i.toString());
        }
    }
}
