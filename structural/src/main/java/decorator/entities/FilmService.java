package decorator.entities;

import decorator.models.Service;
import decorator.models.ServiceDecorator;

public class FilmService extends ServiceDecorator {
    public FilmService(String vendor, Service service) {
        super(service.getName() + " film from " + vendor, service);
    }

    @Override
    public int getPrice() {
        return service.getPrice() + 100;
    }
}
