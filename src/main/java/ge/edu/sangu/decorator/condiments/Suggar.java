package ge.edu.sangu.decorator.condiments;

import java.math.BigDecimal;

import ge.edu.sangu.decorator.component.Beverage;

public class Suggar extends CondimentDecorator {

    private static final BigDecimal COST = BigDecimal.valueOf(0.25);
    private Beverage beverage;

    public Suggar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with suggar ";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(COST);
    }
}
