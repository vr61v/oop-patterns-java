package Decorator;

public class FilmService extends ServiceDecorator{
    public FilmService(String vendor, Service service) {
        super(service.name + " film from " + vendor, service);
    }

    @Override
    public int GetPrice() {
        return _service.GetPrice() + 100;
    }
}
