package chainOfResponsibility;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Handler {
    private Handler successor;
    public abstract void handleRequest();
}
