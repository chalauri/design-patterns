package ge.edu.sangu.decorator.condiments;

import java.math.BigDecimal;

import ge.edu.sangu.decorator.component.Beverage;

public class Mocha extends CondimentDecorator {

    private static final BigDecimal COST = BigDecimal.valueOf(0.25);
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with Mocha ";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(COST);
    }
}
