package Decorator;

public abstract class ServiceDecorator extends Service{
    protected final Service _service;
    public ServiceDecorator(String name, Service service) {
        super(name);
        _service = service;
    }
}
