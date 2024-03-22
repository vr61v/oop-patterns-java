package command.entities;

import command.Car;
import command.Command;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StopCarCommand implements Command {
    private final Car car;
    public StopCarCommand(Car car){ this.car = car; }
    @Override
    public void execute() { car.start(); }
}
