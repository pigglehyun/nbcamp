package calculator;

import calculator.operator.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArithmeticCalculator extends Calculator {

    private static final Set<Character> allowed = Set.of('+', '-', '/', '*', '%');

    public ArithmeticCalculator() {
        super();
    }

    public double calculate(int num1, int num2, char operation) {
        if (!allowed.contains(operation)) {
            throw new IllegalArgumentException();
        }
        double result = 0;

        result = OperatorMapping.getOperator(operation).operate(num1, num2);

        getList().add(result);
        return result;
    }
}
