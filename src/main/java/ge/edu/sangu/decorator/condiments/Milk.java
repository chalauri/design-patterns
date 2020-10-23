package ge.edu.sangu.decorator.condiments;

import java.math.BigDecimal;

import ge.edu.sangu.decorator.component.Beverage;

public class Milk extends CondimentDecorator {

    private static final BigDecimal COST = BigDecimal.valueOf(0.35);
    private Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with milk ";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(COST);
    }
}
