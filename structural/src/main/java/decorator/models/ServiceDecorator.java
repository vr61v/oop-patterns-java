package decorator.models;

public abstract class ServiceDecorator extends Service{
    protected Service service;
    public ServiceDecorator(String name, Service service) {
        super(name);
        this.service = service;
    }
}
