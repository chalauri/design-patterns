package ge.edu.sangu.interpreter.expressions;

import ge.edu.sangu.interpreter.interfaces.Expression;

public class AdditionExpression implements Expression {

    private Expression firstExpression;
    private Expression secondExpression;

    public AdditionExpression(Expression firstExpression, Expression secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }

    @Override
    public double interpret() {
        return firstExpression.interpret() + secondExpression.interpret();
    }
}
