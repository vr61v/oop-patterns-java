package State;

public interface IConnectionState {
    boolean IsConnect();
    void ConnectToService(Service address);
    void StartMyService();
}
