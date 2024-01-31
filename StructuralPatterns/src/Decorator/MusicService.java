package Decorator;

public class MusicService extends ServiceDecorator{
    public MusicService(String vendor, Service service) {
        super(service.name + " music from " + vendor, service);
    }

    @Override
    public int GetPrice() {
        return _service.GetPrice() + 50;
    }
}
