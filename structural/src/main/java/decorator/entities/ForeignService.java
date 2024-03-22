package decorator.entities;

import decorator.models.Service;

public class ForeignService extends Service {
    public ForeignService() {
        super("Foreign service");
    }

    @Override
    public int getPrice() {
        return 199;
    }
}
