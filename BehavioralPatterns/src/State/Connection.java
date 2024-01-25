package State;

public class Connection {
    private State _state;
    private Service _service;
    public Connection(){
        _state = State.Disconnect;
        _service = null;
    }
    boolean IsConnect(){
        return _state == State.Connect;
    }
    void ConnectToService(Service service){
        _service = service;
        _state = State.Connect;
    }
    void StartService(){
        if(_state == State.Disconnect) {
            System.out.println("Service is disconnect!");
            return;
        }
        switch (_service){
            case Service.MyService -> {
                System.out.print("You connect to my service! ");
                System.out.println("I do something...");
            }
            case Service.YourService -> {
                System.out.print("You connect to your service! ");
                System.out.println("You do something...");
            }
            case Service.OtherService -> {
                System.out.print("You connect to other service! ");
                System.out.println("Other do something...");
            }
        }
    }
}
