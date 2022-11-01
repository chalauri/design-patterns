package ge.edu.sangu.decorator.beverages;

import java.math.BigDecimal;

import ge.edu.sangu.decorator.component.Beverage;

public class Americano implements Beverage {

    private static final BigDecimal COST = BigDecimal.valueOf(1.69);
    
    @Override
    public String getDescription() {
        return "Americano ";
    }

    @Override
    public BigDecimal getCost() {
        return COST;
    }
}
