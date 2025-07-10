package calculator.operator;

import java.util.HashMap;
import java.util.Map;

public class OperatorMapping {
    private static Map<Character, OperatorStrategy> operatorMap = new HashMap<>();

    static {
        operatorMap.put('+', new AddOperator());
        operatorMap.put('-', new SubtractOperator());
        operatorMap.put('/', new DivideOperator());
        operatorMap.put('*', new MultiplyOperator());
        operatorMap.put('%', new ModOperator());
    }

    public static OperatorStrategy getOperator(char operator) {
        return operatorMap.get(operator);
    }
}
