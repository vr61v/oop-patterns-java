package decorator.entities;

import decorator.models.Service;

public class RussianService extends Service {
    public RussianService() {
        super("Russian service");
    }

    @Override
    public int getPrice() {
        return 99;
    }
}
