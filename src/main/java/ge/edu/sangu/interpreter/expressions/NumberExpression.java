package ge.edu.sangu.interpreter.expressions;

import ge.edu.sangu.interpreter.interfaces.Expression;

public class NumberExpression implements Expression {

    private double number;

    public NumberExpression(double number) {
        this.number = number;
    }

    @Override
    public double interpret() {

        return this.number;
    }
}
