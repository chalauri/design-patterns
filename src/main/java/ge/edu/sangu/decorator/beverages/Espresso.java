package ge.edu.sangu.decorator.beverages;

import java.math.BigDecimal;

import ge.edu.sangu.decorator.component.Beverage;

public class Espresso extends Beverage {

    private static final BigDecimal COST = BigDecimal.valueOf(1.5);

    @Override
    public String getDescription() {
        return "Espresso ";
    }

    @Override
    public BigDecimal getCost() {
        return COST;
    }
}
