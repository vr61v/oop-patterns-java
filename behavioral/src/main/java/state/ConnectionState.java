package state;

public interface ConnectionState {
    boolean isConnect();
    void connectToService(Service address);
    String startMyService();
}
