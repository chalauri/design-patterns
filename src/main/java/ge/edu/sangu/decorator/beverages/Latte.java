package ge.edu.sangu.decorator.beverages;

import java.math.BigDecimal;

import ge.edu.sangu.decorator.component.Beverage;

public class Latte extends Beverage {

    private static final BigDecimal COST = BigDecimal.valueOf(1.35);

    @Override
    public String getDescription() {
        return "Latte ";
    }

    @Override
    public BigDecimal getCost() {
        return COST;
    }
}
