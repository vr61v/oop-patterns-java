package decorator.entities;

import decorator.models.Service;
import decorator.models.ServiceDecorator;

public class MusicService extends ServiceDecorator {
    public MusicService(String vendor, Service service) {
        super(service.getName() + " music from " + vendor, service);
    }

    @Override
    public int getPrice() {
        return service.getPrice() + 50;
    }
}
