package ge.edu.sangu.decorator.condiments;

import java.math.BigDecimal;

import ge.edu.sangu.decorator.component.Beverage;

public class Soya extends CondimentDecorator {

    private static final BigDecimal COST = BigDecimal.valueOf(0.15);
    private Beverage beverage;

    public Soya(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " with soya ";
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost().add(COST);
    }
}
