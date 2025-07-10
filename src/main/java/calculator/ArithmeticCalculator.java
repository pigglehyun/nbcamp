package calculator;

import calculator.operator.AddOperator;
import calculator.operator.DivideOperator;
import calculator.operator.MultiplyOperator;
import calculator.operator.SubtractOperator;

public class ArithmeticCalculator extends Calculator {

    private static AddOperator addOperator;
    private static SubtractOperator subtractOperator;
    private static MultiplyOperator multiplyOperator;
    private static DivideOperator divideOperator;

    public ArithmeticCalculator() {
        super();
        addOperator = new AddOperator();
        subtractOperator = new SubtractOperator();
        multiplyOperator = new MultiplyOperator();
        divideOperator = new DivideOperator();
    }

    public double calculate(int num1, int num2, char operation) {
        if (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            throw new IllegalArgumentException();
        }
        double result = 0;
        switch (operation) {
            case '+' -> result = addOperator.operate(num1, num2);
            case '-' -> result = subtractOperator.operate(num1, num2);
            case '*' -> result = multiplyOperator.operate(num1, num2);
            case '/' -> result = divideOperator.operate(num1, num2);
        }
        getList().add(result);
        return result;
    }
}
