package ge.edu.sangu.interpreter;

import ge.edu.sangu.interpreter.expressions.AdditionExpression;
import ge.edu.sangu.interpreter.expressions.DivideExpression;
import ge.edu.sangu.interpreter.expressions.MultiplyExpression;
import ge.edu.sangu.interpreter.expressions.NumberExpression;
import ge.edu.sangu.interpreter.expressions.SubtractionExpression;
import ge.edu.sangu.interpreter.interfaces.Expression;

public class Main {

    public static void main(String[] args) {
        // 2 + 5 * 9 - 27 / 3 = 2 + 45 - 9 = 38
        Expression twoExpression = new NumberExpression(2);
        Expression fiveExpression = new NumberExpression(5);
        Expression nineExpression = new NumberExpression(9);
        Expression twentySevenExpression = new NumberExpression(27);
        Expression threeExpression = new NumberExpression(3);

        Expression multiplicationResult = new MultiplyExpression(fiveExpression, nineExpression);
        Expression divisionExpressionResult = new DivideExpression(twentySevenExpression, threeExpression);

        Expression additionalExpressionResult = new AdditionExpression(twoExpression, multiplicationResult);
        Expression subtractionExpressionResult = new SubtractionExpression(additionalExpressionResult, divisionExpressionResult);

        System.out.println("Result = " + subtractionExpressionResult.interpret());


        // 8 + 39/3 = 21
        Expression expression = new AdditionExpression(
                new NumberExpression(8),
                new DivideExpression(new NumberExpression(39), new NumberExpression(3)));

        System.out.println("Result = " + expression.interpret());

        // 26 - 1.5 * 3 + 8 * 0.25 = 26 - 4.5 + 2 = 23.5
        Expression secondExpression = new AdditionExpression(
                new SubtractionExpression(
                        new NumberExpression(26),
                        new MultiplyExpression(new NumberExpression(1.5), new NumberExpression(3))
                ),
                new MultiplyExpression(
                        new NumberExpression(8), new NumberExpression(0.25)
                )
        );

        System.out.println("Result = " + secondExpression.interpret());
    }
}
