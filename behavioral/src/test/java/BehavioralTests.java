import chainOfResponsibility.*;
import command.*;
import command.entities.*;
import iterator.MyAggregate;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import state.Connection;
import state.Service;
import strategy.SearchAlgorithm;
import templateMethod.DefaultCar;
import templateMethod.ElectricCar;

import java.util.ArrayList;
import java.util.stream.Stream;

public class BehavioralTests {
    @Test
    public void testChainOfResponsibility(){
        Handler1 h1 = new Handler1();
        Handler2 h2 = new Handler2();
        Handler3 h3 = new Handler3();

        h1.setSuccessor(h2);
        h2.setSuccessor(h3);
        h1.handleRequest();
    }

    @ParameterizedTest
    @MethodSource("testCommandProvider")
    public void testCommand(Car car){
        Command start = new StartCarCommand(car);
        Command drive = new DriveCarCommand(car);
        Command stop = new StopCarCommand(car);
        Controller controller = new Controller(start, drive, stop);
        controller.start();
        controller.drive();
        controller.start();
    }
    public static Stream<Car> testCommandProvider(){
        return Stream.of(new CarFuelStandard(), new CarFuelBoost());
    }

    @Test
    public void testIterator(){
        var array = new ArrayList<>();
        var aggregate = new MyAggregate<>(array, 10);
        for(int i = 0; i < 10; ++i) aggregate.add(i);
        var iterator = aggregate.iterator();

        Assertions.assertEquals(iterator.begin(), 0);
        Assertions.assertEquals(iterator.end(), 9);
        Assertions.assertNull(iterator.prev());
        Assertions.assertEquals(iterator.current(), 0);
        Assertions.assertEquals(iterator.next(), 1);
        Assertions.assertFalse(iterator.isEnd());
    }

    @Test
    public void testState(){
        Connection connection = new Connection();

        Assertions.assertFalse(connection.isConnect());
        Assertions.assertEquals(connection.startMyService(), "Service is disconnect!");

        connection.connectToService(Service.MyService);
        Assertions.assertTrue(connection.isConnect());

        connection.startMyService();
        Assertions.assertEquals(connection.startMyService(), "You connect to MyService service!\nService do something...");
    }

    @Test
    public void testStrategy(){
        int[] collection = new int[10];
        for(int i = 0; i < 10; ++i) collection[i] = i;

        Assertions.assertFalse(SearchAlgorithm.search(collection, 10));
        Assertions.assertTrue(SearchAlgorithm.search(collection, 4));
        Assertions.assertFalse(SearchAlgorithm.search(collection, -1));
        Assertions.assertTrue(SearchAlgorithm.search(collection, 8));
    }

    @Test
    public void testTemplateMethod(){
        var electricCar = new ElectricCar();
        Assertions.assertEquals(electricCar.drive(), "Start engine in electric car\nSpin wheels in electric car...\nRefuel electric car...\nStop engine in electric car");

        var defaultCar = new DefaultCar();
        Assertions.assertEquals(defaultCar.drive(), "Start engine in default car\nSpin wheels in default car...\nRefuel default car...\nStop engine in default car");
    }
}
