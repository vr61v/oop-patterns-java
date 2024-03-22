package mediator;

import java.io.IOException;
import java.util.Scanner;

public class ReadText {
    public String read() throws IOException {
        System.out.println("I read (write 'exit' for close): ");
        var scan = new Scanner(System.in);
        return scan.nextLine();
    }
}
