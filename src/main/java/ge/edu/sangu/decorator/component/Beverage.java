package ge.edu.sangu.decorator.component;

import java.math.BigDecimal;

public abstract class Beverage {

    private String description;

    private BigDecimal cost;

    public abstract String getDescription();
    public abstract BigDecimal getCost();
}
