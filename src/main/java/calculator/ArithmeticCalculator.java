package calculator;

import calculator.operator.*;

import java.util.Queue;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ArithmeticCalculator <T extends Number> extends Calculator {

    private static final Set<Character> allowed = Set.of('+', '-', '/', '*', '%');

    public ArithmeticCalculator() {
        super();
    }

    public Object calculate(double num1, double num2, char operation) {


        if (!allowed.contains(operation)) {
            throw new IllegalArgumentException();
        }
        double result = OperatorMapping.getOperator(operation).operate(num1, num2);
        T finalResult = convert(result);

        getList().add(finalResult);

        return (Object) finalResult;
    }
    public void getBigger(double num ) {

        Queue<T> list = getList();
        list.stream()
                .filter(x -> x.doubleValue() > num)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }

    private T convert(double num) {

        if (num % 1 == 0) {
            return (T) Integer.valueOf((int) num);
        } else {
            return (T) Double.valueOf(num);
        }
    }


}
