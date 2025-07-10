package calculator;

import calculator.operator.*;

import java.util.Set;

public class ArithmeticCalculator extends Calculator {

    private static final Set<Character> allowed = Set.of('+', '-', '/', '*', '%');

    public ArithmeticCalculator() {
        super();
    }

    public <T> Object calculate(double num1, double num2, char operation) {


        if (!allowed.contains(operation)) {
            throw new IllegalArgumentException();
        }
        double result = OperatorMapping.getOperator(operation).operate(num1, num2);
        T finalResult = convert(result);

        getList().add(finalResult);

        return (Object) finalResult;
    }


    private <T> T convert(double num) {

        if (num % 1 == 0) {
            return (T) Integer.valueOf((int) num);
        } else {
            return (T) Double.valueOf(num);
        }
    }
}
