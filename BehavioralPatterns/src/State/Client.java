package State;

public class Client {
    public static void main(String[] args) {
        Connection connection = new Connection();
        System.out.println("Is service connected? " + connection.IsConnect());
        connection.StartService();
        connection.ConnectToService(Service.MyService);
        System.out.println("Is service connected? " + connection.IsConnect());
        connection.StartService();
    }
}
