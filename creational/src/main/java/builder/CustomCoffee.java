package builder;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class CustomCoffee {
    private Boolean coffee;
    private Boolean milk;
    private Boolean foam;
    private Boolean ice;
    private String company;
    private Integer price;
}
