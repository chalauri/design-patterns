package ge.edu.sangu.interpreter.expressions;

import ge.edu.sangu.interpreter.interfaces.Expression;

public class SubtractionExpression implements Expression {

    private Expression expressionOne;
    private Expression expressionTwo;

    public SubtractionExpression(Expression expressionOne, Expression expressionTwo) {
        this.expressionOne = expressionOne;
        this.expressionTwo = expressionTwo;
    }

    @Override
    public double interpret() {
        return expressionOne.interpret() - expressionTwo.interpret();
    }
}
