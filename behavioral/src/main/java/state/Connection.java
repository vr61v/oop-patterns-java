package state;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Connection implements ConnectionState {
    private State state;
    private Service service;

    public Connection(){
        state = State.Disconnect;
        service = null;
    }

    @Override
    public boolean isConnect(){
        return state == State.Connect;
    }

    @Override
    public void connectToService(Service service){
        this.service = service;
        state = State.Connect;
    }

    @Override
    public String startMyService(){
        if(state == State.Disconnect) { return "Service is disconnect!"; }
        return "You connect to " + service.toString() + " service!\nService do something...";
    }
}
