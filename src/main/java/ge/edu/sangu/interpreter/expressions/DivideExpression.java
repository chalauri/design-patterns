package ge.edu.sangu.interpreter.expressions;

import ge.edu.sangu.interpreter.interfaces.Expression;

public class DivideExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public DivideExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public double interpret() {
        if (Double.compare(secondExpression.interpret(), 0) == 0) {
            throw new IllegalArgumentException("Division by 0 is not allowed");
        }

        return firstExpression.interpret() / secondExpression.interpret();
    }
}
